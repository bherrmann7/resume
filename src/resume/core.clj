(ns resume.core
  (:gen-class )
  (:use [resume.resume-data]
        [resume.resume-html]))

(defn -main
  [& args]
  (resume.resume-html/transform resume.resume-data/resume))

(-main)
