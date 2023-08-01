@Library('sharedLibrary') _

pipeline{
  agent any
   stages{
   
     stage("Greeting Groovy"){
         steps{
        script{
          Calculator.add(100,200)
          Calculator.mul(100,200)
        }
         }
    }

   }
}