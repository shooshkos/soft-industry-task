## README file on how to install, run and write new tests
#### SerenityBDD, RestAssured, Cucumber, JUnit, and Maven are used to write tests.
#### Technology Stack
- Java
- Serenity BDD
- Maven
- RestAssured
#### You will need a few things installed on your computer to complete this project:
- Java: Serenity BDD is a Java library, so you must have a recent JDK installed. JDK 1.8 or later should be fine;
- Maven: Maven 3 or higher must be installed on your computer. This serves as a build tool that also downloads dependencies as it builds;
- A Java IDE: You'll also need a Java Development Environment, such as IntelliJ or Eclipse;


#### Initial instructions
Maven dependencies must be added to the pom.xml file. These dependencies can be obtained from the Maven central repository:
- JUnit (https://mvnrepository.com/artifact/junit/junit/4.13.1)
- Serenity Core (https://mvnrepository.com/artifact/net.serenity-bdd/serenity-core)
- Serenity JUnit (https://mvnrepository.com/artifact/net.serenity-bdd/serenity-junit)
- Serenity REST Assured (https://mvnrepository.com/artifact/net.serenity-bdd/serenity-rest-assured)

Also, in order to run Serenity tests with Maven, you need to add several Maven plugins to the pom.xml file:
- Maven failsafe plugin (which is intended for running integration tests and decouples failing the build if tests fail from actually running the tests)
- Serenity Maven plugin
___________________________________________________
- for local runs clone the project to your local environment
- add tests to the directory
- run the tests directly in GitLab pipeline
_____________________________________________________
## Application Under Test

We are using https://waarkoop-server.herokuapp.com/api/v1/search/test/ endpoint as an Application Under Test.

* URL : https://waarkoop-server.herokuapp.com

## The project directory structure
The project follows the standard directory structure used in most Serenity projects:

```Gherkin
src
  + main
    + java                          
      + starter                     
  + test
    + java                          
      + api                   
      + starter                     
      + utils                       
    + resources
      + features                   
         + search
      + properties                
      + logback-test.xml               
      + schema.json
      + serenity.conf
```
Following instructions will help you to run the project. First, clone this project locally on your machine from the master branch.

### Installation and Test Execution

Open the project in any IDE (e.g. Eclipse, IntelliJ). Run the following command in Terminal and build the project. It will automatically download all the required dependencies.

```sh
$ mvn clean install
```

### Execute Tests

Run the following command in Terminal to execute tests.

```sh
$ mvn clean verify
```

### Test Report

You can find the Serenity reports in the following directory of the Project.

```sh
\target\site\serenity\
```

In the serenity directory, open 'index.html' file to view the report.

### Finally, the source code, please refer

* Github (https://github.com/cvenkatreddy/restassured-serenity-cucumber) with circleci integration(Config.yml)
* GitLab (https://gitlab.com/cvenkatreddy/restassured-serenity-cucumber) with gitlab integration (.gitlab-ci.yml)

- 
# NOTES------------------------------
# NOTES END--------------------------


