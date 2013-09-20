(ns resume.resume-data)

(def resume
  [
    :intro-block [
                   :title "Senior Software Consultant"

                   :addr1 "Robert W. Herrmann"
                   :addr "4 Amandas Way, Groton, MA 01450"
                   :addr "bob@jadn.com  781-526-7764"
                   ]
    :skills [
              "Application Technology" "Rails, Grails, J2EE, Android, Swing, Gradle/Ant/Maven"
              "Application Servers" "Apache, nginx, J2EE, Tomcat"
              "Languages" "Clojure, Java, JavaScript, Ruby, HTML, Perl, C++/C"
              "Operating System" "Linux/Ubuntu/Solaris/Unix, MacOS, Windows"
              "Databases" "MySQL, Oracle, Redis, LDAP"
              "Forgotten" "TRS-80 Basic, Vax 11/780 Assembly, Z-80 Assembly, Fortran, COBOL"
              "User Group Talks" "Griffon, Gradle, Geb Talks, Twitter Bootstrap"]

    :experience [
                  :job ["HubAnalytics, Cambridge, MA" "Principal Software Engineer" "SEP 2012 - Present"]
                  :did ["Designed and Implemented a loan application processing application in Bootstrap/JQuery/Rails/Clojure"
                        "Develop, QA, Deploy, Iterate, Support on a collection of Rails Applications"
                        "DevOps. Responsible for Architecture and implemenation of our cloud operating system"]

                  :job ["InnoCentive, Waltham, MA" "Senior Grails Developer" "JUN 2011 - AUG 2012"]
                  :did ["Evangelize automated functional testing (http://gebish.org)"
                        "Helped add major new feature (Brainstorm Challenges)"
                        "Investigated, recommended, and implemented a payment system (stripe.com)"]

                  :job ["Isobar / Putnam Investments, Boston, MA" "Consulting Engineer" "NOV 2010 - JUL 2011"]
                  :did ["Used Spring/Hibernate/Freemarker to create a simple flexible platform for delivering and sharing information with Financial Advisors"]


                  :job ["NYC Hospitals/Data Vision Group, NJ" "Senior Consulting Engineer" "AUG 2010 - Present"]
                  :did ["The application marries LDAP, command line tools, and a relational database to choreograph a work-flow involving 40 participants involved in the management of a hospital's 40,000 users."
                        "Created web application using Wicket/Hibernate/Spring/JQuery/Java to provide an efficient means for managing hundreds of daily change requests."]


                  :job ["QUICKHIT, MA" "Senior Java/Grails Engineer" "JUN 2010 - SEP 2010"]
                  :did ["Refactored a database of 300 columns by turning it on side.   Resulted in a 50% reduction in storage reduction.   Utilized Java/Hibernate/Spring/Grails."]

                  :job ["InnoCentive, Waltham, MA" "Grails Consultant" "JUN 2008 - MAY 2010"]
                  :did ["Help development of site for matching problem solvers and problem seekers."
                        "Guided transition from old Java Framework (Enhydra) to Grails"
                        "Helped define best practices for development using Grails"
                        "Rapidly delivered  production system for viewing and searching problems"
                        "Developed system for letting users tag content"]

                  :job ["Robert Herrmann Associates, Groton, MA" "Android Development" "DEC 2008 - Present"]
                  :did ["Created \"Car Cast Podcast Player\" an in car podcast player for Android"
                        "Application has over 7000 active users"
                        "Entered into Android Development Contest II"
                        "Application forwards stats, downloads, and errors to central site for analysis"]

                  :job ["ITA Software (now Google), Cambridge, MA" "Senior Consulting Engineer" "JUL 2006 - JUN 2009"]
                  :did ["Participated in design and development of an airline reservations system."
                        "Specialized Load Balancer for handling HTTP Requests and Pulling from Oracle Queues"
                        "Wrote test reporting application using Grails"
                        "Developed Promotion Code processing"
                        "Developed solution for sending rich HTML receipts to customers"]

                  :job ["P&H Solutions (ph.com), Waltham, MA" "Senior Consulting Engineer" "MAY 2004 - JUN 2006"]
                  :did ["Migrated mature banking web application from the Microsoft platform (C++/COM/MTS/ASP/ADO/VB) to the J2EE (Java/JDBC/JSP/JUnit) platform."
                        "Provide just in time architecture and design"
                        "Team resource for Java/J2EE and IDE expertise"
                        "Utilize agile methods: refactoring, unit tests, continuous integration"]

                  :job ["Sun Microsystems, Marlboro, MA" "Senior Consulting Engineer" "JAN 2003 - MAY 2004"]
                  :did ["Part of a team that developed an application for monitoring storage systems.  The application was implemented using Java, XML, Javascript, tag libraries, Oracle, eclipse, Ant, Tomcat, Linux, Solaris"
                        "Designed and developed application features; Searching, Filtering, and Custom Reporting"
                        "Ensure application automatically switched to Chinese, Japanese or French based on client's language"]

                  :job ["Cell Exchange / Boeing, Cambridge, MA" "Consulting Architect/Developer" "DEC 2002"]
                  :did ["Rapidly architected and developed an aircraft inventory/status web application for USAF"]

                  :job ["Sun Microsystems, Burlington, MA" "Consulting Engineer" "MAY 2002 - NOV 2002"]
                  :did ["Contributor to the open source Apache Tomcat project.  Tomcat is the reference JSP/Servlet implementation.  Tomcat is core technology in many J2EE application servers."
                        "Implemented new Servlet 2.4 functionality for Tomcat 4 and Tomcat 5"
                        "Track/fix/eliminated problems with SSL, session handling, and logging"
                        "Participated in Tomcat development community (discussions, votes, bug fixes)"]

                  :job ["Network Engines, Canton, MA" "Senior Consulting Engineer" "DEC 2001 - MAR 2002"]
                  :did ["Helped complete SDK for Rack mount computer control panel"]

                  :job ["Lucent Technologies, Marlboro, MA" "Senior Consulting Java Engineer" "APR 2001 - JUL 2001"]
                  :did ["Improved web based HR system allowing  managers to award bonuses"
                        "Implemented new features using J2EE, JSP, Java, JDBC, HTML, JavaScript, Oracle 9i AS/8i DB"
                        "Refactored JSP reports to include new features and improved speed, quality plus maintainability"
                        "Created a place for managers to post questions and answers to communicate with employees"]

                  :job ["Voice of the Web, Reading, MA" "Chief Architect/Co-Founder" "NOV 2000 - MAR 2001"]
                  :did ["Co-Founded a Startup Company creating software to scan news sites and create spoken audio content from the site’s content.  Finalist in both the Lycos Labs and Boston.com business plan competitions."
                        "Rapidly developed and deployed system in 2 months using J2EE, XML, VoiceXML, Java, JSP, Apache’s Tomcat, tellme.com, Bell Labs Text-to-speech engine"]

                  :job ["Lumapath, Inc. Maynard, MA" "Senior Engineer, Team Leader" "JAN 2000 - NOV 2000"]
                  :did ["Venture funded early stage startup that created an innovative search and user interface technology."
                        "Designed and created a knowledge engineering tool for editors to process daily flow of search terms.  Tool allowed editors to create/edit/test/execute a set of rules for improving search hit quality."
                        "Lead creation of automated deployment system for server farm (JSP/Java, F5’s load balancer, Akamai’s cache, offsite hosting, NT, IIS, Netscape/iPlanet, JavaScript, XML, Oracle)"]

                  :job ["Radnet, Wakefield, MA" "Senior Consulting Engineer" "MAY 1999 - DEC 1999"]
                  :did ["Developed portions of portal architecture (User, Preferences, Content Database) using Java/COM, IIS, ASP, MTS, Oracle"
                        "Developed modular web UI controls included throughout the portal (JavaScript, Java)"
                        "Critiqued existing architecture and suggested and implemented changes"
                        "Mentored team members with Java/COM, JavaScript, XSLT, ASP, MTS, IIS"]

                  :job ["General DataComm/Ericsson, Marlboro, MA" "Senior Consultant" "MAR 1998 - FEB 1999"]
                  :did ["Brought an carrier-grade ATM networking product to production by fixing problems in C on embedded 68k PSOS system"
                        "Devised and created distributed Java based testing tool which executed test plans"]

                  :job ["Sun Microsystems,  Chelmsford, MA"            "Senior Engineer, Team Leader"          "MAR 1996 - MAR 1998"]
                  :did ["Lead team creating Java printing service for network computers"
                        "Researched and developed next generation email system leveraging Java technology"]

                  :job ["Bridge Information Systems, NYC, NY" "Software Engineer" "APR 1994 - MAR 1996"]
                  :did ["Part of team that created a robust electronic order routing and trading system"
                        "Created  C++ networking library that handle millions of daily transactions between Windows, Unix and Databases (Oracle, Sybase)"]

                  :job ["Knight Ridder Financial, NYC, NY" "Software Engineer" "JUL 1990 - MAR 1994"]
                  :did ["Developed networked stock price and financial news processing engine in C/C++"]

                  :job ["CAE-Link Flight Simulation, Binghamton, NY" "Software Developer" "MAY 1989 - JUN 1990"]
                  :did ["Developed simulator initialization system for a B2 Bomber simulator in ADA"
                        "Revised a library used for doing highspeed interpolation from small dataset in Unix/C"]
                  ]

    :education [
                 :school "Binghamton University, NY, MAY 1989"
                 :did ["BS, Electrical Engineering"]

                 :school "CodeSchool.com, July 2013"
                 :did ["Ruby/CSS/Git/Electives 17 courses completed.  See http://www.codeschool.com/users/bherrmann7"]
                 ]
    ])

