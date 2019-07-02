pipeline { 
    agent any  
    stages { 
        stage('Checkout') { 
            steps { 
              mvn checkout
            }
        }
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
    }
}
