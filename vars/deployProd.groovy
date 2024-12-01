def call(){
  echo "Deploying our war file into our tomcat prod server"

                timeout(time: 8, unit: "MINUTES") {
input message: 'Can i deploy to prod ?', parameters: [choice(choices: ['Yes', 'No'], name: 'Prod-approval')], submitter: 'Kovu-admin', submitterParameter: 'admin'        }
                sshagent(['ubuntu']) {
                     sh "scp -o StrictHostKeyChecking=no target/petclinic.war tomcat@34.230.46.9:/opt/tomcat/webapps"
}
