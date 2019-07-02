pipeline { 
    agent any  
    stages { 
        stage('Checkout') { 
            steps { 
              scm checkout
            }
        }
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
    }
}
