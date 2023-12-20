
(ns resume.core
  (:gen-class )
  (:require
     [resume.resume-clojure]
     [resume.resume-clojure-full]
     [resume.resume-full]
     [resume.resume-general]
     
     [resume.resume-html]
     [resume.resume-txt]
        ))

(defn -main
  [& _ ]
  (resume.resume-html/transform "full/" resume.resume-full/resume)

  (resume.resume-html/transform "general/" resume.resume-general/resume)

  (resume.resume-html/transform "clojure/" resume.resume-clojure/resume)

  (resume.resume-html/transform "clojure-full/" resume.resume-clojure-full/resume)

  ;;  (resume.resume-txt/transform "general/" resume.resume-general/resume)
  ;;  (resume.resume-txt/transform "clojure/" resume.resume-clojure/resume)
  )

(-main)
