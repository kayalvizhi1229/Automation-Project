# Automation-Project
Facebook Automation with Selenium & TestNG

📌 Project Overview

This project automates Facebook interactions using Selenium WebDriver and TestNG. It includes:

Logging into Facebook.

Navigating to the profile page and uploading a picture.

Sending a friend request to a suggested friend.

Navigating through Facebook sections like Memories, Saved, Groups, Marketplace, and Videos.

Logging out of Facebook.

Integrated Maven, Page Object Model (POM), Logging (Log4j2), and GitHub Actions for CI/CD.

🏗️ Project Structure

/FacebookAutomation
├── /src
│   ├── /main/java
│   │   ├── /pages (Page Object Model Classes)
│   │   ├── /utils (Utility Classes)
│   │   ├── /tests (Test Cases)
│   ├── /resources
│   │   ├── config.properties (Credentials & Configs)
│   │   ├── log4j2.xml (Logging Configuration)
├── .github/workflows/selenium-tests.yml (CI/CD Workflow)
├── pom.xml (Maven Dependencies)
├── .gitignore
├── README.md

🛠️ Prerequisites

Install Java (JDK 11 or later)

Install Maven

Install Chrome Browser

Download & install Git (for version control)

Set up a Facebook test account (for automation testing)

🚀 Installation & Setup

Clone the Repository:

git clone https://github.com/yourusername/facebook-automation.git
cd facebook-automation

Setup WebDriver & Dependencies:

mvn clean install

Configure Facebook Credentials:

Open src/resources/config.properties

Add your test Facebook credentials:

facebook.username=your_email_or_phone
facebook.password=your_password

🏃 Running Tests

Run all test cases using TestNG:

mvn test

Run a specific test case:

mvn -Dtest=LoginTest test

🔍 Test Scenarios

Test Case ID

Description

TC_01

Login to Facebook

TC_02

Navigate to Profile & Upload Picture

TC_03

Send a Friend Request

TC_04

Navigate to Memories, Saved, Groups, Marketplace, Videos

TC_05

Logout

🛠️ Logging

Log files are stored in logs/

Modify log4j2.xml for different log levels (INFO, DEBUG, ERROR)

📦 Continuous Integration (CI/CD)

The project includes GitHub Actions for automated test execution on every push:

Located at .github/workflows/selenium-tests.yml

Runs tests using Ubuntu & ChromeDriver

👨‍💻 Author

KAYALVIZHI B

LinkedIn: www.linkedin.com/in/kayalvizhi-balasakthivel-812319200
