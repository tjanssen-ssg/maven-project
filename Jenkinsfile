pipeline {
  agent any
  tools{
    maven "localmaven"
  }
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
        withSonarQubeEnv(installationName:'localsonar')
        {
        bat 'mvn -B -Dskiptests clean package sonar:sonar -Dsonar.login=admin -Dsonar.password=Admin'
      }
    }
  }
}
