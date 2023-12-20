(ns resume.resume-html
  (:require [clojure.string]))

(defn table-row [data]
  (let [[label skills & remainder] data]
    (flatten [["<tr><td width=150>" label "</td><td>" skills "</td></tr>"] (if (empty? remainder) "" (table-row remainder))])))

(defmulti consume first)

(defmethod consume nil [data] "")

(defmethod consume :title [data]
  (let [[command title & r] data]
    (flatten [["<center><h2>" title "</h2></center>"] (consume r)])))

(defmethod consume :intro-block [data]
  (let [[command block & r] data]
    (flatten [["<table width=1024><tr><td>" (consume block) "</table>"] (consume r)])))


(defmethod consume :p [data]
  (let [[command txt & r] data]
    (flatten [["<p>" txt "</p>"] (consume r)])
    ))

(defmethod consume :addr1 [data]
  (let [[command addr & r] data]
    (flatten [["<center><font size=+2><b>" addr "</b></font></center>"] (consume r)])
    ))

(defmethod consume :addr [data]
  (let [[command addr & r] data]
    (flatten [["<center>" addr "</center>"] (consume r)])
    ))

(defmethod consume :summary [data]
  (let [[command skill-table & more] data]
    (flatten ["\n<br><h3>Summary</h3><table width=1024><tr><td><ul>\n" (map #(str "<li>" %) skill-table) "</ul>\n</table>\n" (consume more)])
    )
  )

(defmethod consume :skills [data]
  (let [[command skill-table & more] data]
    (flatten ["\n<h3>Skills</h3><table>\n" (table-row skill-table) "\n</table><p>\n" (consume more)])
    )
  )

(defmethod consume :additional-experience [data]
  (let [[command line & more] data]
    (if (nil? line)
      (flatten [ (consume more) ])
      (flatten ["\n<h3>Additional Experince: " line (consume more)])
    )
    )
  )

(defmethod consume :tech [data]
  (let [[command tech-info & more] data]
  (flatten ["<table style='margin-bottom: 8px' width=1024px><tr><td width='5'><td align='left' width=340>Tech: " tech-info "</table></div>" (consume more)])
  ))

(defmethod consume :br [data]
  (let [[command  & more] data]
  (flatten ["<br>" (consume more)])
  ))

(defn bold-first-of-csv [string]
  (let [str-list (clojure.string/split string #",")
        company-raw (first str-list)
        open-paren (.indexOf company-raw "(")
        company-end (if (= -1 open-paren) (count company-raw) open-paren)
        company-name (.substring company-raw 0 company-end)
        company-explain (.substring company-raw company-end)
        ]
    (str "<b>" company-name "</b>" company-explain "," (clojure.string/join ", "(rest str-list)))))

;;(bold-first-of-csv "josh, cow")
;;(bold-first-of-csv "josh (narrow), cow")

(defmethod consume :job [data]
  (let [
         [command job-info & more] data
         [where role when] job-info
         bold-first (bold-first-of-csv where)]
  (flatten ["<div style='page-break-inside: avoid;'><table width=1024px><tr><td align='left' width=340>" bold-first " | " role " | " when "</table>" (consume more)])
  ))

(defmethod consume :did [data]
  (let [[command points & more] data
    ]
  (flatten [ "<table width=1024px><tr><td><ul style='margin-bottom: 0; padding-bottom: 0;'>" (clojure.string/join (map #(str "<li>" % "</li>") points)) "</ul></table>" (consume more)])
  ))

(defmethod consume :experience [data]
  (let [[command experience & more] data]
    (flatten ["\n<h3>Experience</h3>"
              (consume experience)
              (consume more)])
    ))

(defmethod consume :school [data]
  (let [[command school & more] data]
    (flatten [ school (consume more)])
    ))

(defmethod consume :education [data]
  (let [[command education & more] data]
    (flatten ["\n<h3>Education</h3>" (consume education) (consume more)])
    ))

(defmethod consume "" [data]
  (str (first data) (consume rest)))

(defn transform [ parent-dir data]
  (.mkdirs (java.io.File. parent-dir))
  (let [ html-blocks (consume data)
         html (str "
             <html><head>
             <meta http-equiv='Content-Type' content='text/html; charset=utf-8' />
             <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC' crossorigin='anonymous'>
             </head><body>
             <div class='container'>"
             (clojure.string/join html-blocks)
             "</div><p></body>")
        fout (str parent-dir "/resume.html")
        ]
    (spit fout (clojure.string/join html))
    (println fout "written.")
  ))
