pipeline {

    // agent any
    // tools {
    //    maven 'Maven3'
    //    jdk 'JDK8'
    // }

    agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Verify') {
            steps {
                sh "mvn clean verify sonar:sonar"
            }
        }
        stage('Deploy') {
            steps {
                echo "deploy"
                sh "mvn deploy"
            }
        }
    }
}