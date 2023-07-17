
(ns resume.resume-general)

(defn wr [ long-str ]
  (.replaceAll (.replace long-str "\n" " ") "\\s+" " "))

(def resume
  [:intro-block [:addr1 "Robert W. Herrmann"
                 :addr "bob@jadn.com  978-512-0495 linkedin.com/in/robertherrmann Groton, MA"]
   :summary ["Seasoned Lead Software Engineer with 20+ years of experience. Proven track record in building scalable, reliable systems."]

   :skills ["Languages" "Java/SpringBoot, JavaScript, Clojure, SQL, CSS, Scripting"
            "Approaches" "Functional, Object-oriented, Agile, Test Driven, Scrum, REPL, Continuous delivery"
            "Databases" "Postgres, MySQL, Oracle, Redis, LDAP, Datalog"]

   :experience [:job ["Carbonado, Burlington, MA" "Senior Software Engineer" "Nov 2021 - Present"]
                :did ["carbonado"
                      (wr "Drove modernization and development efforts, collaborating on new features for an enterprise-level hospital reporting system, resulting in increased efficiency and improved data accuracy.")
                      (wr "Conceptualized and implemented a stock exchange
                      trading application. The application was used as
                      a workbench for experimenting with different
                      algorithms and machine learning approaches.

                      The project was a resounding success,
                      demonstrating exceptional flexibility in
                      executing trades and delivering substantial
                      knowledge to the organization.")]

                :job ["Elromco, Canton, MA" "Lead Software Engineer" "Mar 2019 - Nov 2021"]
                :did ["elromco"

                      (wr "Responsible for the development of essential
                      microservices (payment, communications,
                      notifications, configuration) within a robust
                      platform aimed at automating order management
                      for moving companies.")

                      (wr "Engaged in a comprehensive design iteration
                      process, collecting requirements, designing,
                      implementing, and repeatedly demonstrating the
                      solution to the owner. ")]

                :job ["Patient Ping, Boston,  MA" "Senior Software Engineer" "Feb 2018 - Mar 2019"]
                :did ["patientping"
                      "Revised the event processing logic for a system that processes HL7 ADT feeds from 8,000 hospital organizations."
                      "Implemented a mechanism for tracing dataflow through a Kafka based messaging system"
                      "Developed tool for generating millions of realistic patient events, enabling robust development of systems without the need for sensitive HIPAA data."]

                :job ["Vecna, Cambridge,  MA" "Lead Software Engineer" "Jun 2017 - Feb 2018"]
                :did ["vecna" "Created system for managing warehouse inventory using SpringBoot"
                      "Designed/Implemented a distributed system for evaluating robotics planning algorithms using ClojureScript."
                      "Performed analysis and tuning on production Java/Tomcat/Postgres system."]

                :job ["Optum Analytics, Boston,  MA" "Senior Software Engineer" "Oct 2013 - Jun 2017"]
                :did ["optum"

                      (wr "Meticulously translated R code from data
                      scientists into SQL, enabling seamless ETL
                      processing of patient data and facilitating data
                      analysis and insights.")

                      (wr "Played an key role in the development and
                      enhancement of an analytics application, which
                      served as the company's core product. Utilizing
                      Java, Spring, Oracle, and Flex, added features,
                      meticulously tracked down bugs, and improved
                      functionality and data visualization
                      capabilities.")]


                :job ["InnoCentive, Waltham, MA" "Senior Grails Developer" "Jun 2011 - Aug 2012"]
                :did ["innocentive"
                      (wr "Created a major new revenue-generating feature
                      that empowered customers to make online
                      purchases. Researched, selected, and implemented
                      a credit card payment system using stripe.com to
                      facilitate secure and seamless credit card
                      transactions.")]

                :job ["NYC Hospitals/Data Vision Group, NJ" "Senior Consulting Engineer" "Aug 2010 - Jun 2011"]
                :did ["nychhc"

                      (wr "Led the end-to-end development lifecycle for a web application from minimal project description. Independently gathered requirements, conducted research, made implementation choices, managed bugs, and coordinated stakeholder meetings. Developed a robust web application using Wicket, Hibernate, Spring, jQuery, Java, and SQL Server technologies, integrating LDAP, command line tools, and a relational database. Orchestrated a workflow involving 40 participants managing a hospital's 40,000 user accounts, providing crucial support from conception to production.")]

                :job ["Isobar / Putnam Investments, Boston, MA" "Lead Consulting Engineer" "Nov 2010 - Jul 2011"]
                :did ["isobar" "Provided leadership and guidance in the development of a system where marketing team could update content, while ensuring engineering team ownership."]

                ]

   :education [:school "Binghamton University, NY, May 1989"
               :did ["bingu" "BS, Electrical Engineering"]]])
