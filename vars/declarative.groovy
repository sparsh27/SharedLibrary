def call(){
node{
    
    agent any
    environment{
    
    PATH="/usr/share/maven/bin/:$PATH"
 }
 

    
    stages{
        
       stage("Git checkout")
       {
           
           steps{
               
               git 'https://github.com/sparsh27/maven.git'
                }
          }
          
          
          stage("Maven Build")
          {
          
          steps{
   
  
         sh "mvn clean package"
         
          }
          
          }
          }
}
}
