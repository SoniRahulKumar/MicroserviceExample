pipeline{
  agent any
  stages{
    stage('Hello'){
      steps{
        echo('Hello world')
      }
    }
    stage('Build'){
      
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
