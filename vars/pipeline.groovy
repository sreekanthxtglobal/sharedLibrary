@Library("sharedLibrary") _
pipeline{
  agent any
   stages{
    stage("Call Groovy"){

        first("Calling Groovy ")
    }
     stage("Greeting Groovy"){
        script{
          greeting.add(100,200)
          greeting.mul(100,200)
        }
    }

   }
}