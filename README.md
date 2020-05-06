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
- create an aws account at aws.amazon.com
- now follow these steps to create elastic beanstalk

> create a new environment
![GitHub Logo](/images/ebs1.png)

> choose web server environment
![GitHub Logo](/images/ebs2.png)

> enter application and environment details
![GitHub Logo](/images/ebs4.png)

> choose platform and upload the jar created by maven build in above step 1
![GitHub Logo](/images/ebs5.png)

> click on configure more options
![GitHub Logo](/images/ebs6.png)

> choose custom configuration
![GitHub Logo](/images/ebs7.png)

> enter the port 8080 (why? this is the port to access spring boot application
![GitHub Logo](/images/ebs8.png)

> now, check the health of elastic bean stalk created.
![GitHub Logo](/images/ebs9.png)

now, you have created elastic beanstalk (in layman terms, it just create an instance of linux environment, a security group created, created elastic ip)

###### step 3
- go to code pipeline

![GitHub Logo](/images/cp1.png)

![GitHub Logo](/images/cp2.png)

![GitHub Logo](/images/cp3.png)

![GitHub Logo](/images/cp4.png)

![GitHub Logo](/images/cp5.png)

![GitHub Logo](/images/cp6.png)

![GitHub Logo](/images/cp7.png)

![GitHub Logo](/images/cp8.png)

![GitHub Logo](/images/cp9.png)

