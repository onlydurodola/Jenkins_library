def call(){
  echo "Deploying our war file into our tomcat Stage server"

                timeout(time: 8, unit: "MINUTES") {
input message: 'Can i deploy to stage ?', parameters: [choice(choices: ['Yes', 'No'], name: 'Stage-approval')], submitter: 'Kovu-admin', submitterParameter: 'admin'        }
                sshagent(['ubuntu']) {
                     sh "scp -o StrictHostKeyChecking=no target/petclinic.war tomcat@18.130.34.244:/opt/tomcat/webapps"

}
