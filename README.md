## Cucumber Framework with Spring Dependency Injection

### Features
* Reusable methods for timeouts & common functions(For proof of concept I wrote couple of methods, but can be extended based on project need)
* Supports both Desktop & Mobile
* More modular
* BDD
* Automate webdriver driver binaries
* Allure reporting
* Jenkins 

### Pre-requisites
* Java 8 or above
* Maven 3
* Any browser
* git (In case if you want to clone the project)

### Steps to run
* Download or clone this project
* Unzip the project in safe location
* To run the tests execute the command in project root directory `mvn clean verify -Dspring.profiles.active=desktop allure:report`
* By default it executes in Chrome browser, to execute in different browser use the flag `browser` for example `-Dbrowser=firefox`

### Reports
This project is configured in such a way to generate  Allure report, which  you can find it in `target/site/allure-maven-plugin/index.html` at the end of the execution



