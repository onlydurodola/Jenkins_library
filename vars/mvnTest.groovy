def call(){
  echo "running test on our maven build" 
  sh "mvn clean test"
}
