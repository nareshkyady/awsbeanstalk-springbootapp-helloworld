# CI/CD with AWS Code Pipeline 

- Technologies involved
  - Spring Boot Application in Java (RestFul Service in Spring Container)
  - Maven (Build)
  - Github (Code Repository)
  - AWS Code Pipeline (Code Build, Code Deploy)
  - AWS S3 (To store artifacts eg. .jar files)
  - AWS ElasticBeanStalk

## Representing visually what we are doing here.
![GitHub Logo](/images/arch.png)

###### step 1
Create a simple spring boot application in your favorite IDE, eclipse/intellij or you can checkout the code committed here.

###### after step 1
- Perform maven clean build
- Run the spring boot application
- output should be below
![GitHub Logo](/images/step1-output.png)

cool! we just built spring boot application!

###### step 2
