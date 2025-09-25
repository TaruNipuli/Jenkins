pipeline {
    agent any
    tools{
        maven 'Maven3'
    }
    stages {
        stage('checking') {
            steps{
                git branch:'main', url: 'https://github.com/ADirin/livedemo_week6_sep1.git'
                }
    }
    stage('build'){
        steps{
            mvn clean install
        }
        }
         stage('Test') {
                    steps {
                        bat 'mvn test'
                    }
                }
                stage('Code Coverage') {
                    steps {
                        bat 'mvn jacoco:report'
                    }
                }
                stage('Publish Test Results') {
                    steps {
                        junit '**/target/surefire-reports/*.xml'
                    }
                }
                stage('Publish Coverage Report') {
                    steps {
                        jacoco()
                    }
                }
            }
        }