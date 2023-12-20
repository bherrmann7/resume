set -e
./mk

# Update clojure resume 
# cd clojure
# tar czf r.tgz resume.html resume.pdf resume.txt
# scp r.tgz root@wilddog.local:/mnt/studio/jadn/ROOT/resume/r.tgz
# rm r.tgz
# ssh root@wilddog.local "set -e;cd /mnt/studio/jadn/ROOT/resume/;tar xfz r.tgz;chown -R tomcat.tomcat ."
# cd ..

ssh root@wilddog.local mkdir -p /mnt/studio/jadn/ROOT/gf/
ssh root@wilddog.local mkdir -p /mnt/studio/jadn/ROOT/g/
ssh root@wilddog.local mkdir -p /mnt/studio/jadn/ROOT/cf/
ssh root@wilddog.local mkdir -p /mnt/studio/jadn/ROOT/c/
scp general/resume.html root@wilddog.local:/mnt/studio/jadn/ROOT/g/index.html
scp full/resume.html root@wilddog.local:/mnt/studio/jadn/ROOT/gf/index.html
scp clojure/resume.html root@wilddog.local:/mnt/studio/jadn/ROOT/c/index.html
scp clojure-full/resume.html root@wilddog.local:/mnt/studio/jadn/ROOT/cf/index.html
