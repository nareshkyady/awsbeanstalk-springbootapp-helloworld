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

### step 1
Create a simple spring boot application in your favorite IDE, eclipse/intellij or you can checkout the code committed here.

### after step 1
- Perform maven clean build
- Run the spring boot application
- output should be below
![GitHub Logo](/images/step-1-output.png)

cool! we just built spring boot application!

### step 2
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

### step 3
- go to code pipeline
> name it
![GitHub Logo](/images/cp1.png)

> add source stage to be github, click on connect to github
![GitHub Logo](/images/cp2.png)

> once connected, choose repository and branch
![GitHub Logo](/images/cp3.png)

> add build stage, click create project
![GitHub Logo](/images/cp4.png)

![GitHub Logo](/images/cp5.png)

> choose a name and linux environment
![GitHub Logo](/images/cp6.png)

> give buildspec name as buildspec.yml (which is commited in this project)
![GitHub Logo](/images/cp7.png)

![GitHub Logo](/images/cp8.png)

> add deploy stage, select application name and environment name
![GitHub Logo](/images/cp9.png)

> create pipeline!

code pipeline is created successfully now!!!

### whats now!
- its all done now!
- start checking in the code now and see how it kicks in the code build, code deploy and sends it to ecs.
- you can see artifacts in S3 created (for reference)
- hit the ecs url http://awsbeanstalk-springbootapp-helloworld.us-east-1.elasticbeanstalk.com/hello and you should be able to see the results which you saw in local (step 1)
 
