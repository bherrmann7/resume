
(ns resume.resume-general
  (:require [resume.resume-full]
            [clojure.string]))

;; This version of the resume stops at my QUICKHIT experience, to keep the resume shorter.

(def resume-pairs       (partition 2 resume.resume-full/resume))
(def experience-section  (first (filter #(= :experience (first %)) resume-pairs)))
(def experiences (second experience-section))
(def experience-short (drop-last (take-while #(not (and (coll? %) (clojure.string/includes? (first %) "Network Engines"))) experiences)))

;; (last experience-short)

(def resume
  (let [replace-map {:experience experience-short
                     :education [:school "Binghamton University, Binghmton, NY"
                                 :did ["BS, Electrical Engineering"]]}]

    (reduce #(concat %1 %2) [] (map #(if (contains? replace-map (first %)) (list (first %) (get replace-map (first %))) %) resume-pairs))))

