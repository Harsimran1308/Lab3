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
                sh 'mkdir lib'
                sh 'cd lib/ ; wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.0/junit-platform-console-standalone-1.7.0-all.jar'
                sh 'cd src ; javac -cp "../lib/junit-platform-console-standalone-1.7.0-all.jar" Lab3Test.java Sin.java Cos.java Tan.java'
            }
        }

        stage('Test'){
            steps{
                sh 'cd src/ ; java -jar ../lib/junit-platform-console-standalone-1.7.0-all.jar -cp "." --select-class Lab3Test --reports-dir="reports"'
                junit 'src/reports/*-jupiter.xml'
            }
        }

        stage('Deploy'){
            steps{
                sh 'cd src/ ; java App' 
            }
        }
    }

}