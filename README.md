
# Resume

If github is the "new resume", then why not check in code to generate your resume?

Ideally takes generic data about a resume and transforms it into a realized html resume.

## Usage

    $ git clone git@github.com:bherrmann7/resume.git
	$ # edit the  src/resume/resume_data.clj
	$ # provide images of companies in png format, save them to images
    $ clojure src/resume/core.clj
    $ open clojure/resume.html
	
# To PDF

    $ nbb install
    $ nbb html-to-pdf.cljs clojure/resume.html clojure/resume.pdf
    $ nbb html-to-pdf.cljs general/resume.html general/resume.pdf

## License

Copyright © 2021,2023

Distributed under the Eclipse Public License, the same as Clojure.
