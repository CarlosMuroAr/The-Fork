##TEST AUTOMATION PROJECT - THE FORK

## Technologies
1. Java
2. Selenium Webdriver
3. TestNG

## PRE-Conditions

1. Java >8.0 
2. Maven >3.8.4
3. CHROME DRIVER FOR MAC - VERSION 108
4. CHROME DRIVER FOR WINDOWS - VERSION 107
NOTE: Before to execute you need to check the version of chromedriver and update it

## Usage

1. Open the console and mvn install in the /pom.xml file
2. Right click on testng.xml and run

## Structure

- CORE: Classes and methods that I reuse throughout the project, such as click, wait, etc.
- DATA: Data of the test cases (using excel files) 
- POM: Page Object Model
- TESTS: Test cases using TestNG