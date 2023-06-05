
(ns resume.core
  (:gen-class )
  (:require [resume.resume-data]
            [resume.resume-html]
            [resume.resume-txt]
        ))

(defn -main
  [& args]
  (resume.resume-html/transform resume.resume-data/resume)
  (resume.resume-txt/transform resume.resume-data/resume))

(-main)
