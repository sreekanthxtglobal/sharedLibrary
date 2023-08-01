@Library('sharedLibrary') _

pipeline{
  agent any
   stages{
   
     stage("Greeting Groovy"){

         steps{
            greeting("Welcome ")   
            script{
                Calculator.add(100,200)
                Calculator.mul(100,200)
            }
          
        }
         }
    }

   }
}