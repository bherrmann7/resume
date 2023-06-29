(ns resume.resume-txt
  (:require [clojure.string]))

(defn table-row [data]
  (let [[label skills & remainder] data]
    (flatten [[label " --> " skills "\n"] (if (empty? remainder) "" (table-row remainder))])))

(defmulti consume first)

(defmethod consume nil [data] "")

(defmethod consume :title [data]
  (let [[command title & r] data]
    (flatten [[title "\n"] (consume r)])))

(defmethod consume :intro-block [data]
  (let [[command block & r] data]
    (flatten [[(consume block) "\n"] (consume r)])))

(defmethod consume :addr1 [data]
  (let [[command addr & r] data]
    (flatten [[addr "\n"] (consume r)])))

(defmethod consume :addr [data]
  (let [[command addr & r] data]
    (flatten [[addr "\n"] (consume r)])))

(defmethod consume :summary [data]
  (let [[command skill-table & more] data]
    (flatten ["\nSummary\n" (map #(str " - " % "\n") skill-table) "\n" (consume more)])))

(defmethod consume :skills [data]
  (let [[command skill-table & more] data]
    (flatten ["\nSkills\n" (table-row skill-table) "\n" (consume more)])))

(defn bold-first-of-csv [string]
  (let [str-list (clojure.string/split string #",")]
    (str (first str-list) " " (clojure.string/join ", " (rest str-list)))))

(defmethod consume :job [data]
  (let [[command job-info & more] data
        [where role when] job-info
        bold-first (bold-first-of-csv where)]
    (flatten [bold-first " | " role " | " when "\n" (consume more)])))

(defmethod consume :did [data]
  (let [[command items & more] data
        image-name (first items)
        points (rest items)]
    (flatten [(clojure.string/join (map #(str " - " % "\n") points)) "\n" (consume more)])))

(defmethod consume :experience [data]
  (let [[command experience & more] data]
    (flatten ["\nExperience\n"
              (consume experience)
              (consume more)])))

(defmethod consume :school [data]
  (let [[command school & more] data]
    (flatten [school (consume more)])))

(defmethod consume :education [data]
  (let [[command education & more] data]
    (flatten ["\nEducation\n" (consume education) (consume more)])))

(defmethod consume "" [data]
  (str (first data) (consume rest)))

(defn transform [parent-dir data]
  (.mkdirs (java.io.File. parent-dir))
  (let [txt-blocks (consume data)
        txt (clojure.string/join txt-blocks)
        fout (str parent-dir "/resume.txt")]
    (spit fout txt)))

