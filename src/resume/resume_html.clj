(ns resume.resume-html)

(defn table-row [data]
  (let [[label skills & remainder] data]
    (flatten [["<tr><td width=220>" label "</td><td>" skills "</td></tr>"] (if (empty? remainder) "" (table-row remainder))])))

(defmulti consume first)
(defmethod consume nil [data] "")

(defmethod consume :title [data]
  (let [[cmd title & r] data]
    (flatten [["<center><h2>" title "</h2></center>"] (consume r)])))

(defmethod consume :intro-block [data]
  (let [[cmd block & r] data]
    (flatten [["<table width=800><tr><td>" (consume block) "</table>"] (consume r)])))


(defmethod consume :addr [data]
  (let [[cmd addr & r] data]
    (flatten [["<center>" addr "</center>"] (consume r)])
    ))

(defmethod consume :addr1 [data]
  (let [[cmd addr & r] data]
    (flatten [["<center><b>" addr "</b></center>"] (consume r)])
    ))

(defmethod consume :skills [data]
  (let [[command skill-table & more] data]
    (flatten ["\n<p><h3>Technologies</h3><table>\n" (table-row skill-table) "\n</table><p>\n" (consume more)])
    )
  )

(defn bold-first-of-csv [string]
  (let [str-list (clojure.string/split string #",")]
  (str "<b>" (first str-list) "</b>," (clojure.string/join ", "(rest str-list)))))

(defmethod consume :job [data]
  (let [
         [command job-info & more] data
         [where role when] job-info
         bold-first (bold-first-of-csv where)]
  (flatten ["<p><table width=800px><tr><td align='left' width=340>" bold-first "<td align='center'>" role "<td align='right'>" when "</tr></table>" (consume more)])
  ))

(defmethod consume :did [data]
  (let [[command items & more] data
        image-name (first items)
        points (rest items)]
  (flatten [ "<table width=800px><tr><td><ul><li>" (clojure.string/join "<li>" points) "</ul><td align='right'><img src='images/" image-name ".png'/></table>" (consume more)])
  ))

(defmethod consume :experience [data]
  (let [[command experience & more] data]
    (flatten ["\n<h3>Experience</h3>"
              (consume experience)
              (consume more)])
    ))

(defmethod consume :school [data]
  (let [[command school & more] data]
    (flatten [ school (consume more)])
    ))

(defmethod consume :education [data]
  (let [[command education & more] data]
    (flatten ["\n<h3>Education</h3>" (consume education) (consume more)])
    ))

(defmethod consume "" [data]
  (str (first data) (consume rest)))

(defn transform [data]
  (def html-blocks (consume data))
  (def html (str "<html><head><link rel='stylesheet' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css'>\n"
             "<link rel='stylesheet' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css'>\n"
             "<script src='http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js'></script></head><body>\n"
             "<div class='container'>"
             (clojure.string/join html-blocks)
             "</div><p></body>"))
  (spit "resume.html" (clojure.string/join html))
  (println "resume.html written.")
  )
