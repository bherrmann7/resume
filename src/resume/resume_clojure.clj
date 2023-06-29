
(ns resume.resume-clojure
  (:require resume.resume-general))


(def pairs (partition 2 resume.resume-general/resume))

(def replace-map {

   :summary ["Senior Engineer with 20+ years of experience. Proven track record in building scalable, reliable systems."

             "Passionate advocate for problem-solving aligned with the
             Clojure philosophy of software development, emphasizing
             simplicity, immutability, and functional programming
             principles."
             ]

   :skills ["Languages" "Clojure, ClojureScript, Java/SpringBoot, JavaScript,SQL, CSS, Scripting"
            "Approaches" "Functional, Object-oriented, Agile, Test Driven, Scrum, REPL, Continuous delivery"
            "Databases" "Postgres, MySQL, Oracle, Redis, LDAP, Datalog"]


   :education [
               :school "Binghamton University, NY, May 1989"
               :did ["bingu" "BS, Electrical Engineering"]

               :school "Attended Clojure Conferences (Clojure Conj); 2023, 2017, 2014"
               ]
               
})

(def resume (reduce #(concat %1 %2) [] (map #(if (contains? replace-map (first %)) (list (first %) (get replace-map (first %))) %) pairs)))


