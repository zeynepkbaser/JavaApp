pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                
                script {
                if (isUnix()) {
                     sh 'javac Hello.java'
                    } else {
                     bat 'javac Hello.java'
                }
                }
                
            }
        }
        stage('Publish Test Results') {
            steps {
                
                script {
                 if (isUnix()) {
                     sh 'java Hello'
                    } else {
                     bat 'java Hello'
                }
                }
                
            }
        }
    }
}
