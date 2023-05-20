tar czf r.tgz resume.html images
scp r.tgz root@wilddog.local:/mnt/studio/jadn/ROOT/resume/r.tgz
rm r.tgz
ssh root@wilddog.local "set -e;cd /mnt/studio/jadn/ROOT/resume/;tar xfz r.tgz;chown -R tomcat.tomcat ."


