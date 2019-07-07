node {
   def mvnHome
   stage('Checkout') {
      git 'https://github.com/nareshkumar-h/jenkins-maven-core-demo.git'
      mvnHome = tool 'maven'
   }
   stage('Build') {
        withEnv(["MVN_HOME=$mvnHome"]) {
          sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
        }
   }
   stage('Tests') {
      // Run the maven build
      withEnv(["MVN_HOME=$mvnHome"]) {
         sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore=false test'
      }
   }
}
