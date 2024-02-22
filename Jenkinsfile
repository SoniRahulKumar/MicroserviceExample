pipeline{
  agent any
  environment {
	MAVEN_HOME = tool 'myMaven'
	PATH = "$MAVEN_HOME/bin:$PATH"
  }
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
	  sh 'mvn clean'
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
