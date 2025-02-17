## Challenge Uber Send Email Repository
### Description
This application simulates sending an email message.
Sending an email message is done using AWS resources.
### Prerequisites
- AWS Account
- AWS EC2
- AWS IAM user and access key
- Java JDK 23
- Apache Maven
- RestFull application tool
## How to test api
### Setup
#### Clone, Clean, compile and create package and execute the package
- git clone https://github.com/juniorbertoluci/challenge_sendemail.git
- cd challenge_sendemail\uber
- edit file: src\main\java\dev\bertoluci\uber\infrastructure\ses\AwsSesConfig.java
-- insert the AWS access key in the parameters "accesskey" and "secretkey" 
- mvn clean
- mvn install
- mvn compiler:compiler
- mvn org.apache.maven.plugins:maven-compiler-plugin:compile
- java -jar target\Uber-0.0.1-SNAPSHOT.jar
#### Testing the application
##### POST Send Email
URL: http://localhost:8080/api/email
###### Example Body JSON
###### Observation: inform your email for the test in the parameter "to"
###### {
###### "to": "email@email.com",
###### "subject": "Teste AWS-API",
###### "body": "Hello from Teste AWS-API"
###### }
###### Return from de test if is OK
###### If the message "Email send successfully" to appear in the application you will receive a email test