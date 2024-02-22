pipeline{
  agent any
  stages{
    stage('Clone Repo'){
      steps{
       echo('Code Chekout from Repository')
	 git url: 'https://github.com/SoniRahulKumar/MicroserviceExample.git' , branch: 'master'
      }
    }
    stage('Build'){
      steps{
        echo('Building')
          mvn 'package'
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
