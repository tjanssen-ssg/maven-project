pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        //sh 'mvn clean compile test'
        bat 'mvn clean compile test'
        echo "Testing is done"
      }
    }
    stage('Build') {
      steps {
       // sh 'mvn package'
        bat 'mvn package'
      }
    }

  }
}
