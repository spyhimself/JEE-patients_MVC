# JEE Patients MVC

This is a Java Enterprise Edition (JEE) application that implements the Model-View-Controller (MVC) architecture to manage a list of patients in a hospital.

## Features

- Add, update, and delete patients from a MySQL database
- View a list of all patients in the database
- Search for a specific patient by name or ID
- Sort the list of patients by name or ID
- Pagination of the patient list
- User authentication and authorization using Java EE Security
- CRUD operations using Java Persistence API (JPA)
- Implemented using MVC architecture

## Prerequisites

To run this application, you will need:

- Java SE Development Kit 8 or later
- Apache Maven
- MySQL server

## How to Run

1. Clone this repository to your local machine using `git clone https://github.com/spyhimself/JEE_patients-mvc.git`
2. Navigate to the project root directory using `cd JEE_patients-mvc`
3. Create a MySQL database and execute the SQL script `create-table.sql` to create the necessary table
4. Update the `persistence.xml` file with the appropriate database connection details
5. Run `mvn clean package` to build the project and create a WAR file
6. Deploy the WAR file to a JEE application server, such as Apache Tomcat
7. Access the application at `http://localhost:<port>/JEE_patients-mvc/`

## Built With

- Java Enterprise Edition
- Model-View-Controller (MVC) architecture
- Java Persistence API (JPA)
- MySQL
- Apache Maven
- Thymeleaf
