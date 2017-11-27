node('dind')
{
stage('checkout')
{
checkout scm
}
stage('Compile')
{
mvn target: "compile"
}
stage('Test')
{
mvn target: "Test"
}
}
