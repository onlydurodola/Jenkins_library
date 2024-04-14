def call(){
      steps {
             echo 'Checking out our code'
            git branch: 'main', url: 'https://github.com/ooghenekaro/Petclinic-tomcat-deploy.git'
      }

}
