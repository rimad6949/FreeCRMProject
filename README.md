# Overview

This project is an automation framework for testing the FreeCRM Website using Selenium with Java. It is designed to validate various functionalities of the website, including testing the Landing page, homepage, login into the application, creating a contact, validating the deal page.

## Tech Stack

Programming Language: Java

Automation Tool: Selenium WebDriver

Build Tool: Maven

Testing Framework: TestNG

Design Pattern: Page Object Model (POM)

Data Handling: Apache POI (for Excel data-driven testing)

Logging: Log4j

Reporting: Extent Reports

## Project Structure
```bash
TutorialNinjaAutomation/
│-- src/
│   ├── main/java/com/basePage/			    # Base Page class
│   ├── main/java/com/pages/			      # Page classes
│   ├── test/java/com/crm/testBase/     # Test BasePage class
│   ├── test/java/com/crm/testcases/    # Test classes
│   ├── test/resources/properties/
│   ├── test/resources/runner/
│-- test-output/                        # Test reports
│-- pom.xml                             # Maven dependencies
│-- README.md                           # Project documentation
```

## Features Automated

✅ Landing Page        
✅ User Login Page   
✅ Homepage    
✅ Contact Page       
✅ Deal Page 
✅ Companies Page 

## Installation & Setup

### Prerequisites:

✅ Install Java JDK 8+
✅ Install Maven
✅ Install Eclipse
✅ Download Selenium WebDriver
✅ Add required dependencies in pom.xml

## Steps to Set Up:

1. Clone the repository:
```bash
git clone https://github.com/rimad6949/FreeCRMProject.git
```
2. Open the project in your preferred IDE.
3. Ensure all dependencies are installed using Maven:
```bash
mvn clean install
```
4. Update the config.properties file with browser settings and test URLs.
5. Execute test cases using TestNG Runner.

## Running Tests

### To run tests using TestNG, execute:
```bash
mvn test
```

### To generate an Extent Report, check the test-output folder after execution.

## Reporting

After test execution, a Report is generated at:

### Location of Report
Test-output/index.html

Open this file in a browser to view detailed execution results.
