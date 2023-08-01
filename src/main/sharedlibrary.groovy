@Library('sharedLibrary') _

pipeline
{
    agent any
    stages
    {
        stage('Demonstration of shared library')
        {
            steps
            {
                greeting("Testuser1")
            }
        }
        stage('Demonstration of shared library1')
        {
            steps
            {
                script{
                    calculator.add(10,20)
                    calculator.mul(10,20)
                }
                
            }
        }
    }
}
