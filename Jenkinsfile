pipeline {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/master']],userRemoteConfigs:
                [[credentialsId: 'github-ssh-key', url: 'git@github.com:Harsimran1308/Lab3.git']]]
            }
        }

        stage('Build'){
            steps{
                bat 'mvn clean compile'
            }
        }

        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }

        stage('Deploy'){
            steps{
                bat 'cd src/ ; java App' 
            }
        }
    }

}