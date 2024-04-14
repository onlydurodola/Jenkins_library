def call(){
  echo "validating our maven build again" 
  sh "mvn clean validate"
}
