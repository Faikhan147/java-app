pipeline {
  
    agent any 

    environment {
        IMAGE_NAME = "faisalkhan35/java-main:latest"

    }
    tools {
      maven 'Maven17'
    }

    stages {
        
        stage('Git clone') {
            steps {
                checkout scm
            }
        }

        stage('Maven Dev Build') {
            when {
                branch 'dev'
            }
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Maven Main Build') {
            when {
                branch 'main'
            }
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker build') {
            when {
                branch 'main'
            }
            steps {
                sh 'docker build -t ${IMAGE_NAME} .'
            }
        }

        stage('Docker Deploy') {
            when {
                branch 'main'
            }
            steps {
                sh 'docker run --name myapp -p 8082:8080 -d ${IMAGE_NAME}'
            }
        }
    }
}
