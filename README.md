# MICROSERVICE SEND EMAIL

### Reference Documentation
In this project, i used the following dependencies:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.flyway)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#io.email)
### Description of the project

In this project, I developed a microservice with the purpose of sending emails. This project was undertaken on a personal basis with the goal of deepening my knowledge of microservices. I chose to use the Gmail service to send emails for the sake of simplicity. If this project were more professional, I could have used [AWS](https://aws.amazon.com/) or a similar provider. However, as mentioned earlier, the main objective of this project was to train in microservices and the Java Spring framework, along with the dependencies used.

I plan to use this microservice in future external projects, and, as evident, there is still room for improvement, such as in exception handling and potential migration to AWS.
### Guides
The following guides illustrate how make this project works on you own computer:

* You have to install PostGres (PgAdmin4) and create a data base called "Email", then you must change the config of username and password of [Application Properties](src/main/resources/application.properties);
* You need an gmail account with security password to send email via third party programs, here you can find the way [Manual](https://support.google.com/accounts/answer/185833);
* Once you have your email configured you have to change the email and the password you created on [Application Properties](src/main/resources/application.properties);
* To finish, just start the app and send some email for fun!

### Example: sendind and email

* Open PostMen/Insomnia;
* Create a collection named SendEmail or Something like that;
* Choose Post with this url http://localhost:8080/sendemail;
* Write this Json body:
``` java
  {
  "ownerRef":"Your name",
  "emailFrom": "Sender Email",
  "emailTo": "Reciever Email",
  "subject": "Example",
  "text":"Example"
  }
  ```
* Send it and have fun!
