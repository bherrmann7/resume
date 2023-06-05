(ns resume.resume-data)

(def resume
  [
    :intro-block [
                   :title "Senior Software Engineer"
                   :addr1 "Robert W. Herrmann"
                   :addr "43 Fawn Ter, Groton, MA 01450"
                   :addr "bob@jadn.com  978-512-0495"
                   :addr "https://www.linkedin.com/in/robertherrmann/"
                  ]
   :summary [
             "Results-driven Senior Software Engineer with a strong aptitude for solving complex problems and delivering innovative solutions."
             "Skilled at effectively communicating intricate technical tradeoffs to stakeholders."
             "Experienced in leading and managing projects, driving technological innovation, and leveraging a wide range of technologies"
             "Proficient in functional and object-oriented programming, Agile, Test-Driven Development (TDD), Scrum, and Continuous Delivery."
             "Strong expertise in database management with a focus on Postgres, MySQL, Oracle, Redis, and LDAP."
             ]

    :skills [
             "Languages" "Java/SpringBoot, JavaScript, Clojure, SQL, CSS, C++, Python, Scripting, Bash, Perl, Kotlin"
             "Operating System" "Linux/Ubuntu/Unix, MacOS, Windows, Multics"
             "Approaches" "Functional, Object-oriented, Agile, Test Driven, Scrum, REPL, Continuous delivery"
             "Databases" "Postgres, MySQL, Oracle, Redis, LDAP, Datalog"
             "Data" "JSON, EDN, XML, XSLT, HL7"
             "Tools" "IntelliJ, AWS, Docker, GIT, Jenkins, Maven, Gradle, Jupyter, Emacs, Mirth"
            ]
   :experience [
                :job [ "Carbonado, Burlington, MA" "Consulting Engineer" "Nov 2021 - Present"]
                :did [ "carbonado"
                      "Collaborated in the modernization and development of new features for an enterprise-level hospital reporting system"
                      "Designed and implemented a stock exchange trading application that leveraged real-time ticker data and sophisticated algorithms to execute trades"
                      ]
                :job [ "Elromco, Canton, MA" "Consulting Software Engineer" "Mar 2019 - Nov 2021"]
                :did [ "elromco"
                      "Developed microservices for platform automating the order management for moving companies"
                      "Collected requirements, designed, implemented, and demonstrated solutions" ]

                :job [ "Patient Ping, Boston,  MA" "Consulting Software Engineer" "Feb 2018 - Mar 2019" ]
                :did [ "patientping"
                     "Revised the event processing logic for a system that processes HL7 ADT feeds from 8,000 hospital organizations."
                      "Implemented a mechanism for tracing dataflow through a Kafka based messaging system"
                      "Developed tool for generating millions of realistic patient events, enabling robust development of systems without the need for sensitive HIPAA data."]

                :job [ "Vecna, Cambridge,  MA" "Consulting Software Engineer" "Jun 2017 - Feb 2018" ]
                :did [ "vecna" "Created system for managing warehouse inventory using SpringBoot"
                    "Designed/Implemented a distributed system for evaluating robotics planning algorithms using ClojureScript."
                    "Did performance analysis and tuning on production Java/Tomcat/Postgres system" ]

                :job [ "Optum Analytics, Boston,  MA" "Consulting Software Engineer" "Oct 2013 - Jun 2017" ]
                :did [ "optum"
                      "Developed team standards for developing/using Javascript/ES6 with React/Redux"
                      "Translated R code from data scientists into SQL dialect for ETL processing of patient data."
                      "Added features to an analytics application - Java/Spring/Oracle/Flex"
                      "Leverage and promote Clojure/ClojureScript" ]

                  :job ["HubAnalytics, Cambridge, MA" "Principal Software Engineer" "Sep 2012 - Oct 2013"]
                  :did [ "hubanalytics" "Created a loan application processor in Bootstrap/JQuery/Clojure"
                        "Develop, QA, Deploy, Iterate, Support on a collection of Rails Applications"
                        "DevOps. Responsible for architecture and implementation of our cloud operating system"]

                  :job ["InnoCentive, Waltham, MA" "Senior Grails Developer" "Jun 2011 - Aug 2012"]
                  :did [ "innocentive" "Evangelized browser based automated functional testing solution using Selenium WebDriver"
                        "Reponsible for adding new feature with corresponding payment system (stripe.com)"]

                  :job ["Putnam Investments, Boston, MA" "Consulting Engineer" "Nov 2010 - Jul 2011"]
                  :did ["isobar" "Led a team in the development and implementation of a content management system utilizing Spring, Hibernate, and Freemarker."]

                  :job ["NYC Hospitals/Data Vision Group, NJ" "Senior Consulting Engineer" "Aug 2010 - Jul 2011"]
                  :did [ "nychhc" "The web application marries LDAP, command line tools, and a relational database to choreograph a work-flow involving 40 participants involved in the management of a hospital's 40,000 users"
                        "The application used Wicket/Hibernate/Spring/JQuery/Java/SqlServer"]

                  :job ["QUICKHIT, MA" "Senior Java/Grails Engineer" "Jun 2010 - Sep 2010"]
                  :did [ "quickhit" "Refactored a database of 300 columns by turning columns into rows.   Resulted in a 50% reduction in storage reduction."]

                  :job ["InnoCentive, Waltham, MA" "Grails Consultant" "Jun 2008 - May 2010"]
                  :did [ "innocentive" "Guided transition from old web framework to modern web framework"
                        "Helped define best practices for development using Grails web application platform"
                        "Rapidly delivered  production system for viewing and searching content"
                        ]

                  :job ["ITA Software (now Google), Cambridge, MA" "Senior Consulting Engineer" "Jul 2006 - Jun 2009"]
                  :did [ "ita"
                      "Participated in the design and development of an airline reservations system"
                      "Designed and Implemented a specialized Load Balancer for handling airline flight pricing requests "
                      "Wrote system test reporting application using Grails"
                      "Developed a Discount Code processor that integrated with an external company system."
                      "Developed a solution for sending rich HTML receipts to customers"
                      ]

                  :job ["P&H Solutions (ph.com), Waltham, MA" "Senior Consulting Engineer" "May 2004 - Jun 2006"]
                   :did [ "phsolutions" "Migrated mature banking web application from the Microsoft platform (C++/COM/MTS/ASP/ADO/VB) to the J2EE (Java/JDBC/JSP/JUnit) platform"
                          "Provided just-in-time architecture and design expertise, serving as a valuable resource for the team in Java/J2EE development and IDE proficiency."
                          "Promoted agile methods: refactoring, unit tests, continuous integration"]

                  :job ["Sun Microsystems, Marlboro, MA" "Senior Consulting Engineer" "Jan 2003 - May 2004"]
                  :did ["sunmicro" "Part of a team that developed an application for monitoring enterprise storage systems"]

                  :job ["Sun Microsystems, Burlington, MA" "Consulting Engineer" "May 2002 - Nov 2002"]
                  :did ["sunmicro" "Attained the position of Apache Tomcat Committer by leading the implementation of the Servlet 2.4 specification."]

                  :job ["Network Engines, Canton, MA" "Senior Consulting Engineer" "Dec 2001 - Mar 2002"]
                  :did ["networkengines" "Contributed to the finalization of an SDK for a rack-mount computer control panel"]

                  :job ["Lucent Technologies, Marlboro, MA" "Senior Consulting Java Engineer" "Apr 2001 - Jul 2001"]
                  :did ["lucent" "Enhanced a web-based HR system to enable managers to efficiently grant bonuses" ]

                  :job ["Voice of the Web, Reading, MA" "Chief Architect/Co-Founder" "Nov 2000 - Mar 2001"]
                  :did [ "votw" "Co-Founded a Startup Company creating software to scan news sites and create spoken audio content from the site's content." ]

                  :job ["Lumapath, Inc. Maynard, MA" "Senior Engineer, Team Leader" "Jan 2000 - Nov 2000"]
                  :did [ "lumapath"
                      "Led the development of a robust and seamless automated deployment system, ensuring flawless and hassle-free deployments."]

                  :job ["Radnet, Wakefield, MA" "Senior Consulting Engineer" "May 1999 - Dec 1999"]
                  :did [ "radnet" "Developed key portions of web portal architecture (User, Preferences, Content Database) using Java/COM, IIS, ASP, MTS, Oracle" ]

                  :job ["General DataComm/Ericsson, Marlboro, MA" "Senior Consultant" "Mar 1998 - Feb 1999"]
                  :did [ "gdc" "Contributed to the successful launch of a carrier-grade Asynchronous Transfer Mode (ATM) networking product."]

                  :job ["Sun Microsystems,  Chelmsford, MA"            "Senior Engineer, Team Leader"          "Mar 1996 - Mar 1998"]
                  :did [ "sunmicro" "Lead team creating Java printing service for network computers"
                        "Researched and developed next generation email system leveraging Java technology"]

                  :job ["Bridge Information Systems (now Reuters), NYC, NY" "Software Engineer" "Apr 1994 - Mar 1996"]
                  :did ["bridge" "Part of team that created a robust electronic order routing and trading system"]

                  :job ["Knight Ridder Financial (now Reuters), NYC, NY" "Software Engineer" "Jul 1990 - Mar 1994"]
                  :did [ "krf" "Developed networked stock price and financial news processing engine (ticker plant) in C/C++"]

                  :job ["CAE-Link Flight Simulation, Binghamton, NY" "Software Developer" "May 1989 - Jun 1990"]
                  :did ["caelink" "Designed and developed the initialization subsystem for a B2 Bomber flight training simulator in Ada" ]
                  ]

    :education [
                 :school "Binghamton University, NY, May 1989"
                 :did [ "bingu" "BS, Electrical Engineering"]

                 ]
    ])

