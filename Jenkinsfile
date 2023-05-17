pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('Clean and Install') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
