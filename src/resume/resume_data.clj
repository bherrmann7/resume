(ns resume.resume-data)

(def resume
  [
    :intro-block [
                   :title "Senior Software Consultant"

                   :addr1 "Robert W. Herrmann"
                   :addr "43 Fawn Ter, Groton, MA 01450"
                   :addr "bob@jadn.com  978-512-0495"
                   ]
    :skills [

              "Languages" "Clojure, Java, JavaScript, React, CSS"
              "Operating System" "Linux/Ubuntu/Solaris/Unix, MacOS, Windows"
              "Databases" "MySQL, Oracle, Redis, LDAP"
    ]

   :experience [
                :job [ "Elromco, Canton, MA" "Consulting Software Enginner" "March 2019 - Present"]
                :did [ "elromco"
                       "Developed product for automating the logistics required by small moving companies" 
                       "Utilized Java/MySql/SpringBoot/Microservices" ]

                :job [ "Patient Ping, Boston,  MA" "Consulting Software Engineer" "Feb 2018 - MAR 2019" ]
                :did [ "patientping"
                    "Updated patient records based on requests from external systems"
                    "Changed data access paths to use a MySQL partitioned index to speed up production"
                    "Implemented a mechanism for tracing dataflow through Kafka based messaging system"
                    "Designed/Implemented comparison process to enable vetting of system changes"
                    "Created tool for generating millions of patients for testing" ]

                :job [ "Vecna, Cambridge,  MA" "Consulting Software Engineer" "JUN 2017 - FEB 2018" ]
                :did [ "vecna" "Created system for managing warehouse inventory using SpringBoot"
                    "Designed/Implemented a distributed system for evaluating robotics planning algorithms"
                    "Did performance analysis on production Java/Tomcat/Postgres system" ]

                 :job [ "Optum Analytics, Boston,  MA" "Consulting Software Engineer" "OCT 2013 - JUN 2017" ]
                 :did [ "optum"   "Designed/Delivered a custom sql query engine for accessing patient data in Java/Spring"
                   "Developed team standards for developing/using Javascript/ES6 with React/Redux"
                   "Crafted SQL ETL to place new patient data in warehouse"
                   "Added features to an analytics application - Java/Spring/Oracle/Flex"
                   "Leverage and promote Clojure/ClojureScript" ]

                  :job ["HubAnalytics, Cambridge, MA" "Principal Software Engineer" "SEP 2012 - OCT 2013"]
                  :did [ "hubanalytics" "Created a loan application processor in Bootstrap/JQuery/Rails/Clojure"
                        "Develop, QA, Deploy, Iterate, Support on a collection of Rails Applications"
                        "DevOps. Responsible for architecture and implementation of our cloud operating system"]

                  :job ["InnoCentive, Waltham, MA" "Senior Grails Developer" "JUN 2011 - AUG 2012"]
                  :did [ "innocentive" "Evangelized automated functional testing (http://gebish.org)"
                        "Helped add major new feature (Brainstorm Challenges) to grails site"
                        "Investigated, recommended, and implemented a payment system (stripe.com)"]

                  :job ["Isobar / Putnam Investments, Boston, MA" "Consulting Engineer" "NOV 2010 - JUL 2011"]
                  :did ["isobar" "Selected Spring/Hibernate/Freemarker to realize a system marketing could update, but engineering could own"]

                  :job ["NYC Hospitals/Data Vision Group, NJ" "Senior Consulting Engineer" "AUG 2010 - Present"]
                  :did [ "nychhc" "The web application marries LDAP, command line tools, and a relational database to choreograph a work-flow involving 40 participants involved in the management of a hospital's 40,000 users"
                        "The application used Wicket/Hibernate/Spring/JQuery/Java/SqlServer"]

                  :job ["QUICKHIT, MA" "Senior Java/Grails Engineer" "JUN 2010 - SEP 2010"]
                  :did [ "quickhit" "Refactored a database of 300 columns by turning columns into rows.   Resulted in a 50% reduction in storage reduction.   Utilized Java/Hibernate/Spring/Grails"]

                  :job ["InnoCentive, Waltham, MA" "Grails Consultant" "JUN 2008 - MAY 2010"]
                  :did [ "innocentive" "Help development of site for matching problem solvers and solution seekers"
                        "Guided transition from old Java Framework (Enhydra) to Grails"
                        "Helped define best practices for development using Grails"
                        "Rapidly delivered  production system for viewing and searching content"
                        "Developed system for letting users tag content"]

                  :job ["Robert Herrmann Associates, Groton, MA" "Android Development" "DEC 2008 - Present"]
                  :did [ "carcast" "Created 'Car Cast Podcast Player' an in car podcast player for Android"
                        "Application has over 7000 active users"
                        "Entered into Android Development Contest II"
                        "Application forwards stats, downloads, and errors to central site for analysis"]

                  :job ["ITA Software (now Google), Cambridge, MA" "Senior Consulting Engineer" "JUL 2006 - JUN 2009"]
                  :did [ "ita" "Participated in design and development of an airline reservations system"
                        "Specialized load balancer for handling HTTP requests and pulling from Oracle queues"
                        "Wrote test reporting application using Grails"
                        "Developed solution for sending rich HTML receipts to customers"]

                  :job ["P&H Solutions (ph.com), Waltham, MA" "Senior Consulting Engineer" "MAY 2004 - JUN 2006"]
                  :did [ "phsolutions" "Migrated mature banking web application from the Microsoft platform (C++/COM/MTS/ASP/ADO/VB) to the J2EE (Java/JDBC/JSP/JUnit) platform"
                        "Provide just in time architecture and design"
                        "Team resource for Java/J2EE and IDE expertise"
                        "Utilize agile methods: refactoring, unit tests, continuous integration"]

                  :job ["Sun Microsystems, Marlboro, MA" "Senior Consulting Engineer" "JAN 2003 - MAY 2004"]
                  :did ["sunmicro" "Part of a team that developed an application for monitoring storage systems"
                        "The application was implemented using Java, XML, Javascript, tag libraries, Oracle, eclipse, Ant, Tomcat, Linux, Solaris"
                        "Designed and developed application features; Searching, Filtering, and Custom Reporting"
                        "Worked to drive application's automatic switching to Chinese, Japanese or French based on client's language"]

                  :job ["Cell Exchange / Boeing, Cambridge, MA" "Consulting Architect/Developer" "DEC 2002"]
                  :did ["cellexchange" "Rapidly architected and developed an aircraft inventory/status web application for USAF bases"]

                  :job ["Sun Microsystems, Burlington, MA" "Consulting Engineer" "MAY 2002 - NOV 2002"]
                  :did ["sunmicro" "Contributor to the open source Apache Tomcat project.  Tomcat is the reference JSP/Servlet implementation.  Tomcat is core technology in many J2EE application servers"
                        "Implemented new Servlet 2.4 functionality for Tomcat 4 and Tomcat 5"
                        "Track/fix/eliminated problems with SSL, session handling, and logging"
                        "Participated in Tomcat development community (discussions, votes, bug fixes)"]

                  :job ["Network Engines, Canton, MA" "Senior Consulting Engineer" "DEC 2001 - MAR 2002"]
                  :did ["networkengines" "Helped complete SDK for Rack mount computer control panel"]

                  :job ["Lucent Technologies, Marlboro, MA" "Senior Consulting Java Engineer" "APR 2001 - JUL 2001"]
                  :did ["lucent" "Improved web based HR system allowing  managers to award bonuses"
                        "Implemented new features using J2EE, JSP, Java, JDBC, HTML, JavaScript, Oracle 9i AS/8i DB"
                        "Refactored JSP reports to include new features and improved speed, quality plus maintainability"
                        "Created a place for managers to post questions and answers to communicate with employees"]

                  :job ["Voice of the Web, Reading, MA" "Chief Architect/Co-Founder" "NOV 2000 - MAR 2001"]
                  :did [ "votw" "Co-Founded a Startup Company creating software to scan news sites and create spoken audio content from the site's content.  Finalist in both the Lycos Labs and Boston.com business plan competitions"
                        "Rapidly developed and deployed system in 2 months using J2EE, XML, VoiceXML, Java, JSP, Apache's Tomcat, tellme.com, Bell Labs Text-to-speech engine"]

                  :job ["Lumapath, Inc. Maynard, MA" "Senior Engineer, Team Leader" "JAN 2000 - NOV 2000"]
                  :did [ "lumapath" "Venture funded early stage startup that created an innovative search and user interface technology"
                        "Designed and created a knowledge engineering tool for editors to process daily flow of search terms.  Tool allowed editors to create/edit/test/execute a set of rules for improving search hit quality"
                        "Lead creation of automated deployment system for server farm (JSP/Java, F5's load balancer, Akamai's cache, offsite hosting, NT, IIS, Netscape/iPlanet, JavaScript, XML, Oracle)"]

                  :job ["Radnet, Wakefield, MA" "Senior Consulting Engineer" "MAY 1999 - DEC 1999"]
                  :did [ "radnet" "Developed portions of portal architecture (User, Preferences, Content Database) using Java/COM, IIS, ASP, MTS, Oracle"
                        "Developed modular web UI controls included throughout the portal (JavaScript, Java)"
                        "Critiqued existing architecture and suggested and implemented changes"
                        "Mentored team members with Java/COM, JavaScript, XSLT, ASP, MTS, IIS"]

                  :job ["General DataComm/Ericsson, Marlboro, MA" "Senior Consultant" "MAR 1998 - FEB 1999"]
                  :did [ "gdc" "Brought an carrier-grade ATM networking product to production by fixing problems in C on embedded 68k PSOS system"
                        "Devised and created distributed Java based testing tool which executed test plans"]

                  :job ["Sun Microsystems,  Chelmsford, MA"            "Senior Engineer, Team Leader"          "MAR 1996 - MAR 1998"]
                  :did [ "sunmicro" "Lead team creating Java printing service for network computers"
                        "Researched and developed next generation email system leveraging Java technology"]

                  :job ["Bridge Information Systems, NYC, NY" "Software Engineer" "APR 1994 - MAR 1996"]
                  :did ["bridge" "Part of team that created a robust electronic order routing and trading system"
                        "Created  C++ networking library that handle millions of daily transactions between Windows, Unix and Databases (Oracle, Sybase)"]

                  :job ["Knight Ridder Financial, NYC, NY" "Software Engineer" "JUL 1990 - MAR 1994"]
                  :did [ "krf" "Developed networked stock price and financial news processing engine in C/C++"]

                  :job ["CAE-Link Flight Simulation, Binghamton, NY" "Software Developer" "MAY 1989 - JUN 1990"]
                  :did ["caelink" "Developed simulator initialization system for a B2 Bomber simulator in ADA"
                        "Revised a library used for doing highspeed interpolation from small dataset in Unix/C"]
                  ]

    :education [
                 :school "Binghamton University, NY, MAY 1989"
                 :did [ "bingu" "BS, Electrical Engineering"]

                 :school "CodeSchool.com, July 2013"
                 :did [ "codeschool" "Ruby/CSS/Git/Electives 17 courses completed.  See http://www.codeschool.com/users/bherrmann7"]
                 ]
    ])

