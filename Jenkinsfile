pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Cloning the code..'
                bat 'git clone <reponame>'
            }
        }
        stage('Install Dependencies') {
            steps {
                echo 'Installing dependencies..'
                bat 'mvn install'
            }
        }
        stage('Execute the tests') {
            steps {
                echo 'Executing  tests....'
                bat 'mvn clean verify -Dspring.profiles.active=desktop'
            }
        }

         stage('Generate Report') {
             steps {
                  echo 'Generating report....'
                  bat 'mvn allure:report'
             }
         }
    }
}