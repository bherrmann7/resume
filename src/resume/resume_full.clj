
(ns resume.resume-full)

(defn wr [ long-str ]
  (.replaceAll (.replace long-str "\n" " ") "\\s+" " "))

(def resume
  [:intro-block [:addr1 "Robert Herrmann"
                 :addr "bob@jadn.com&nbsp;&nbsp;978-512-0495&nbsp;&nbsp;linkedin.com/in/robertherrmann&nbsp;&nbsp;43 Fawn Ter, Groton, MA, 01450"]
   :summary ["Seasoned Software Engineer with 25+ years of experience. Proven track record in building scalable, reliable systems."]

   :skills ["Languages" "Java/SpringBoot, JavaScript, Clojure, SQL, Python"
            "Approaches" "Functional, Object-oriented, Agile, Test Driven, Scrum, REPL, Continuous delivery"
            "Databases" "Postgres, MySQL, Oracle, SQL Server, Redis, LDAP, Kafka, Elasticsearch"]

   :experience [:job ["Carbonado Technologies (Botique Consulting), Burlington, MA" "Senior Software Engineer" "Nov 2021 - Present"]
                :did [
                      (wr "Migrated records from 1.3 million patients forward across 10 years of database changes. ")
                      ]
                :did [
                      (wr "Conceptualized and implemented a stock exchange
                      trading application. The application was used as
                      a workbench for experimenting with different
                      algorithms and machine learning approaches." )
                      (wr "The project was a resounding success,
                      demonstrating exceptional flexibility in
                      executing trades and delivering substantial
                      knowledge to the organization.")]
                :tech "Mirth · HL7v2 · REST APIs · AWS · Spring Boot · KDB+ · Clojure · Java · Postgres · JavaScript · Python · Interactive Brokers API"

                :job ["Elromco (Moving Software), Canton, MA" "Lead Software Engineer" "Mar 2019 - Nov 2021"]
                :did [
                      (wr "Responsible for the development of essential
                      microservices (payment, communications,
                      notifications, configuration) within a robust
                      platform aimed at automating order management
                      for moving companies.")

                      (wr "Engaged in a comprehensive design iteration
                      process, collecting requirements, designing,
                      implementing, and repeatedly demonstrating the
                      solution to the owner. ")]
                :tech "Microservices · REST APIs · Jenkins · CI/CD · Full-Stack · AWS · Spring Boot · Clojure · Java"

                :job ["Patient Ping (Patient Tracking), Boston,  MA" "Senior Software Engineer" "Feb 2018 - Mar 2019"]
                :did [
                      "Revised the event processing logic for a system that processes HL7 ADT feeds from 8,000 hospital organizations."
                      "Implemented a mechanism for tracing dataflow through a Kafka based messaging system"
                      "Developed tool for generating millions of realistic patient events, enabling robust development of systems without the need for sensitive HIPAA data."]
                :tech "HL7v2 · REST APIs · Jenkins · CI/CD · Full-Stack · Elasticsearch · AWS · Spring Boot · Clojure · Java · React · MySQL · Kotlin · Kafka"

                :job ["Vecna (Hospital Software), Cambridge,  MA" "Lead Software Engineer" "Jun 2017 - Feb 2018"]
                :did ["Created system for managing warehouse inventory using SpringBoot"
                      "Designed/Implemented a distributed system for evaluating robotics planning algorithms using ClojureScript."
                      "Performed analysis and tuning on production Java/Tomcat/Postgres system."]
                :tech "REST APIs · Jenkins · CI/CD · AWS · Full-Stack · Spring Boot · ClojureScript · Java · Agile · React · MySQL"

                :job ["Optum Analytics (Paitent Population Analytics), Boston,  MA" "Senior Software Engineer" "Oct 2013 - Jun 2017"]
                :did [
                      (wr "Meticulously translated R code from Data
                      Scientists into SQL, enabling seamless ETL
                      processing of patient data and facilitating data
                      analysis and insights.")

                      (wr "Played an key role in the development and
                      enhancement of an analytics application, which
                      served as the company's core product. Utilizing
                      Java, Spring, Oracle, and Flex, added features,
                      meticulously tracked down bugs, and improved
                      functionality and data visualization
                      capabilities.")]
                :tech "REST APIs · Jenkins · CI/CD · Full-Stack · Oracle · Spring Framework · React · Redux · Clojure · ClojureScript · Java · JavaScript"

                :job ["HubAnalytics (Email Marketing), Cambridge, MA" "Principal Software Engineer" "SEP 2012 - SEP 2013"]
                :did [
                      "Created a loan application processor in Bootstrap/JQuery/Clojure"
                      "Develop, QA, Deploy, Iterate, Support on a collection of store front Rails Applications"
                      "DevOps. Responsible for all architecture and implementation"]
                :tech "Ruby on Rails · Redis · CI/CD · Jenkins · MySQL · RabbitMQ · JavaScript · JQuery · Bootstrap · Clojure"

                :job ["InnoCentive (Challenges Marketplace, now Wazokucrowd.com), Waltham, MA" "Senior Grails Developer" "Jun 2011 - Aug 2012"]
                :did [
                      (wr "Created a major new revenue-generating feature
                      that empowered customers to make online
                      purchases. Researched, selected, and implemented
                      a credit card payment system using stripe.com to
                      facilitate secure and seamless credit card
                      transactions.")
                      "Evangelized automated functional testing (http://gebish.org)"
                      "Helped add major new feature (Brainstorm Challenges) to grails site"
                      "Investigated, recommended, and implemented a payment system (stripe.com)"
                      ]
                :tech "REST APIs · Jenkins · CI/CD · Full-Stack · JavaScript · Grails · Groovy · MySQL · Elasticsearch · Stripe"

                :job ["Putnam Investments, Boston, MA" "Lead Consulting Engineer" "Nov 2010 - Jul 2011"]
                :did ["Provided leadership and guidance in the development of a system where marketing team could update content, while ensuring engineering team ownership."]
                :tech "Jenkins · CI/CD · Full-Stack · Freemarker · Java · Spring"

                :job ["NYC Health + Hospitals, New York City, NY" "Senior Consulting Engineer" "Aug 2010 - Jun 2011"]
                :did [
                      (wr "Led the end-to-end development lifecycle for a web application from minimal project description. Independently gathered requirements, conducted research, made implementation choices, managed bugs, and coordinated stakeholder meetings. Developed a robust web application using Wicket, Hibernate, Spring, jQuery, Java, and SQL Server technologies, integrating LDAP, command line tools, and a relational database. Orchestrated a workflow involving 40 participants managing a hospital's 40,000 user accounts, providing crucial support from conception to production.")]
                :tech "Tomcat · Wicket · Java · Jenkins · CI/CD · Full-Stack · JavaScript · Sql Server · Novell NetWare"

                
                :job ["QUICKHIT (Fantasy Football Game), MA" "Senior Java/Grails Engineer" "JUN 2010 - SEP 2010"]
                :did ["Refactored a database of 300 columns by turning columns into rows.   Resulted in a 50% reduction in storage reduction. "]
                :tech "Java · Spring · Hibernate · Grails · MySQL"

                :job ["InnoCentive (Challenges Marketplace, now Wazokucrowd.com), Waltham, MA" "Grails Consultant" "JUN 2008 - MAY 2010"]
                :did ["Help development of site for matching problem solvers and solution seekers"
                      "Guided transition from old Java Framework (Enhydra) to Grails"
                      "Helped define best practices for development using Grails"
                      "Rapidly delivered  production system for viewing and searching content"
                      "Developed system for letting users tag content"]
                :tech "REST APIs · Jenkins · CI/CD · Full-Stack · JavaScript · Grails · Groovy · MySQL · Elasticsearch"
                
                :job ["Robert Herrmann Associates (side project), Groton, MA" "Android Development" "DEC 2008 - DEC 2018"]
                :did ["Created Open Source \"Car Cast Podcast Player\" an in car podcast player for Android Phones"
                      "Application has over 100k installed users"
                      "Entered into Android Development Contest II"
                      "Application forwards stats, downloads, and errors to central site for analysis"]
                :tech "REST APIs · Andriod · Java · MySQL"

                  :job ["ITA Software (now part of Google), Cambridge, MA" "Senior Consulting Engineer" "JUL 2006 - JUN 2009"]
                  :did ["Participated in design and development of an airline reservations system"
                        "Specialized load balancer for handling HTTP requests and pulling from Oracle queues"
                        "Wrote test reporting application using Grails"
                        "Developed solution for sending rich HTML receipts to customers"]
                  :tech "REST APIs · JSP · Javascript · CSS · HTML · Email HTML/CSS"

                  :job ["P&H Solutions (Banking Software, now ACI Worldwide), Waltham, MA" "Senior Consulting Engineer" "MAY 2004 - JUN 2006"]
                  :did ["Migrated mature banking web application from the Microsoft platform to the J2EE platform"
                        "Provide just in time architecture and design"
                        "Team resource for Java/J2EE and IDE expertise"
                        "Utilize agile methods: refactoring, unit tests, continuous integration"]
                 :tech "COM · C++ · JSP · Spring · Hibernate · MySQL · JUnit · C++ · COM · MTS · ASP · ADO · VB" 

                  :job ["Sun Microsystems, Marlboro, MA" "Senior Consulting Engineer" "JAN 2003 - MAY 2004"]
                  :did ["Part of a team that developed an application for monitoring enterprise storage systems"
                        "Designed and developed application features; Searching, Filtering, and Custom Reporting"
                        "Worked to drive application's automatic switching to Chinese, Japanese or French based on client's language"]
                 :tech "Java · XML · JavaScript · Oracle · Tomcat"

                  :job ["Cell Exchange / Boeing, Cambridge, MA" "Consulting Architect/Developer" "DEC 2002"]
                  :did ["Rapidly architected and developed an aircraft inventory/status web application for USAF bases"]
                  :tech "Java · MySql · Tomcat"
                
                  :job ["Sun Microsystems, Burlington, MA" "Consulting Engineer" "MAY 2002 - NOV 2002"]
                  :did ["Committer on the Apache Tomcat project.  Tomcat is the reference JSP/Servlet implementation.  Tomcat is core technology in many J2EE application servers"
                        "Implemented new Servlet 2.4 functionality for Tomcat 4 and Tomcat 5"
                        "Track/fix/eliminated problems with SSL, session handling, and logging"
                        "Participated in Tomcat development community (discussions, votes, bug fixes)"]
                 :tech "Java · Tomcat"

                  :job ["Network Engines, Canton, MA" "Senior Consulting Engineer" "DEC 2001 - MAR 2002"]
                  :did ["Helped complete SDK for Rack mount computer control panel"]
                  :tech "Java"

                  :job ["Lucent Technologies, Marlboro, MA" "Senior Consulting Java Engineer" "APR 2001 - JUL 2001"]
                  :did ["Improved web based HR system allowing  managers to award bonuses"
                        "Refactored JSP reports to include new features and improved speed, quality plus maintainability"
                        "Created a place for managers to post questions and answers to communicate with employees"]
                 :tech "J2EE · JSP · Java · JDBC · HTML · JavaScript · Oracle 9i AS/8i DB"
 
                  :job ["Voice of the Web, Reading, MA" "Chief Architect/Co-Founder" "NOV 2000 - MAR 2001"]
                  :did ["Co-Founded a Startup Company creating software to scan news sites and create spoken audio content from the site's content.  Finalist in both the Lycos Labs and Boston.com business plan competitions"
                        "Rapidly developed and deployed system in 2 months"
                        ]
                  :tech "J2EE · XML · VoiceXML · Java · JSP · Apache's Tomcat · tellme.com · Bell Labs Text-to-speech engine"

                  :job ["Lumapath, Inc. Maynard, MA" "Senior Engineer, Team Leader" "JAN 2000 - NOV 2000"]
                  :did ["Venture funded early stage startup that created an innovative search and user interface technology"
                        "Designed and created a Knowledge Engineering Tool (KET) for editors to process daily flow of search terms.  Tool allowed editors to create/edit/test/execute a set of rules for improving search hit quality"
                        "Lead creation of automated deployment system for server farm"]
                        
                  :tech "Java Swing · F5's load balancer · Akamai's cache · NT · IIS · Netscape/iPlanet · JavaScript · XML · Oracle"                        

                  :job ["Radnet, Wakefield, MA" "Senior Consulting Engineer" "MAY 1999 - DEC 1999"]
                  :did ["Developed portions of portal architecture (User, Preferences, Content Database) "
                        "Developed modular web UI controls included throughout the portal (JavaScript, Java)"
                        "Critiqued existing architecture and suggested and implemented changes"
                        "Mentored team members"]
                  :tech "Java · COM · JavaScript · XSLT · ASP · MTS · IIS · Oracle"

                  :job ["General DataComm/Ericsson, Marlboro, MA" "Senior Consultant" "MAR 1998 - FEB 1999"]
                  :did ["Brought an carrier-grade ATM networking product to production by fixing problems in C on embedded 68k PSOS system"
                        "Devised, Championed, and owned a distributed Java based testing tool which executed test plans"]
                  :tech "Java · Asynchronous Transfer Mode (ATM) · JUnit · Unix · C"

                  :job ["Sun Microsystems,  Chelmsford, MA"            "Senior Engineer, Team Leader"          "MAR 1996 - MAR 1998"]
                  :did ["Lead team creating Java printing service for network computers"
                        "Researched and developed next generation email system leveraging Java technology"]
                  :tech "Java · SMTP · LPD Protocol · JavaMail API"

                  :job ["Bridge Information Systems (now owned by Reuters), NYC, NY" "Software Engineer" "APR 1994 - MAR 1996"]
                  :did ["Part of team that created a robust electronic order routing and trading system"
                        "Created C++ networking library that handle millions of daily transactions between Windows, Unix and Databases (Oracle, Sybase)"]
                  :tech "C++ · PLSQL · Oracle · Tandem Computers"

                  :job ["Knight Ridder Financial (now owned by Reuters), NYC, NY" "Software Engineer" "JUL 1990 - MAR 1994"]
                  :did ["Developed networked stock price and financial news processing engine in C/C++"]
                  :tech "Unix · C · C++ · Motif"

                  :job ["CAE-Link Flight Simulation, Binghamton, NY" "Software Developer" "MAY 1989 - JUN 1990"]
                  :did ["Developed simulator initialization system for a B2 Bomber simulator"
                        "Revised a library used for doing highspeed interpolation from small dataset in Unix/C"]
                  :tech "ADA · VAX 11/780 · Concurrent Systems · Unix · C"
                
                ]

   :additional-experience nil

   :education [:school "Binghamton University, NY, May 1989"
               :did ["Bachelors Degree, Electrical Engineering"]]])
