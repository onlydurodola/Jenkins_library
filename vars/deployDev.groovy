def call (){
      echo "Deploying our war file into our tomcat dev server"
      sshagent(['ubuntu']) {
      sh "scp -o StrictHostKeyChecking=no target/petclinic.war tomcat@18.130.34.244:/opt/tomcat/webapps"
      }
