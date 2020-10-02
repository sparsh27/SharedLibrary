def call(){
pipeline{
    
    agent any
    environment{
    
    PATH="/usr/share/maven/bin/:$PATH"
 }
 

    
    stages{
        
       stage("Git checkout")
       {
           
           steps{
               
               git 'https://github.com/sparsh27/Shared-new.git'
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
