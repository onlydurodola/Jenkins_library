def call (){
      echo "Deploying our war file into our tomcat dev server"
      sshagent(['ubuntu']) {
      sh "scp -o StrictHostKeyChecking=no target/petclinic.war tomcat@3.83.93.111:/opt/tomcat/webapps"
}
