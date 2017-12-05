pipeline {
    agent any
    tools {
            maven 'apache-maven-3.5.2'
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
             stage('One more stage') {
                        steps {
                            sh 'echo "Done : )"'
                        }
                    }
        }
}