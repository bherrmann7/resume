
;;
;; This was extracted from https://github.com/yogthos/resume/blob/main/compile.cljs
;;

(ns html-to-pdf
  (:require
   ["fs" :as fs]
   ["path" :as path]
   ["puppeteer$default" :as puppeteer]))

(defn slurp [filename & {:keys [encoding]}]
  (.toString
   (if encoding
     (fs/readFileSync filename encoding)
     (fs/readFileSync filename))))

(defn write-pdf [{:keys [browser pending target pdf-opts]} html]
  (-> browser
      (.then #(.newPage %))
      (.then
       (fn [page _]
         (-> (.setContent page html)
             (.then #(.emulateMediaType page "screen"))
             (.then (fn [_ _]
                      (-> (.pdf page (clj->js (merge {:path target} pdf-opts)))
                          (.then
                           (fn [_] (reset! pending false)))
                          (.catch #(js/console.error (.-message %))))))
             (.catch #(js/console.error (.-message %))))))))

(defn main [in-file out-file]
  (let [browser
        (.launch puppeteer #js {:headless true
                                :args #js ["--no-sandbox" "--disable-setuid-sandbox"]})
        pending  (when browser
                   (doto (atom true)
                     (add-watch :watcher
                                (fn [_ _ _ pending]
                                  (when-not pending
                                    (.then (js/Promise.resolve browser)
                                           #(.close %)))))))]

    (write-pdf
     {:target   out-file
      :browser  browser
      :pending  pending
      :pdf-opts {:format "Letter"
                 :printBackground true
                 :pdfViewport {:width 1920 :height 1280}
                 :margin {:top "0.4in"
                          :bottom "0.4in"
                          :left "0.4in"
                          :right "0.4in"}}}
     (slurp in-file))))



(def cmd-line-args (drop 1 (not-empty (js->clj (.slice js/process.argv 2)))))
(main (first cmd-line-args) (second cmd-line-args))

(println "done.")
