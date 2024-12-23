# Automating Client Registration Form Testing

## Objective

The goal of this application is to automate the testing of a client registration form with a successful login process. The tests verify that the form behaves as expected under various conditions, ensuring that the registration process is smooth and error-free.

## Technologies Used

- **Serenity BDD** (Version 4.2.8): For behavior-driven development (BDD) and detailed test reporting. Serenity BDD helps create comprehensive reports that provide insights into the behavior of the system during the testing process.
- **Screenplay Pattern**: The tests are implemented using the Screenplay pattern, which promotes a more maintainable and readable test suite by clearly defining the roles of each component and focusing on interactions between them.
- **Cucumber** (Version 7.20.1): For writing feature files in a human-readable format using Gherkin syntax. Cucumber allows for writing tests that are easy to understand, even for non-technical stakeholders.
- **JUnit** (Version 5.11.3): For running the tests and managing test execution, providing detailed test results.
- **Java** (Version 11): The programming language used to develop and run the tests.
- **Gherkin Language**: Used to define test scenarios in feature files, making them easy to understand and collaborate on with both technical and non-technical team members.
- **Angular** (Version 16): The application under test is based on Angular 16, which is a modern front-end framework for building web applications. This enables a dynamic and responsive user interface for the client registration process.

## How It Works

The application automates the registration process of a client, ensuring that the form behaves as expected in terms of validation, input fields, and successful submission. The tests simulate the entire user journey, starting from the login process and ending with a successful registration notification.
