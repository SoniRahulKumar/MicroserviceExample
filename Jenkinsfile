pipeline{
  agent any
  stages{
    stage('Hello'){
      steps{
        echo('Hello world')
      }
    }
    stage('Build'){
      agent { docker { image 'maven:3.9.6-eclipse-temurin-17-alpine' } }
      steps{
        echo('Building')
        sh 'mvn --version'
      }
    }
    stage('Deploy'){
      steps{
        echo('Deploying')
      }
    }
    stage('Test'){
      steps{
        echo('Testing')
      }
    }
    stage('Release'){
      steps{
        echo('Releasing')
      }
    }
  }
}
