# Employee Management System

An Employee Management System built with Java and PostgreSQL to perform CRUD (Create, Read, Update, Delete) operations on employee data. This application demonstrates the use of JDBC for database interaction and is designed to simplify employee data management tasks.

## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Setup Instructions](#setup-instructions)
5. [Usage](#usage)
6. [Contributing](#contributing)

---

## Introduction
This project is a basic Employee Management System where users can:
- Add employee records to a database.
- Retrieve and display employee details.
- Update employee information.
- Delete employee records.

It is a great starting point for learning about relational databases and Java database connectivity (JDBC).

---

## Features
- Create new employees and save them in a PostgreSQL database.
- Retrieve employee information by ID or view all employees.
- Update existing employee details.
- Delete employees from the database.

---

## Technologies Used
- **Programming Language:** Java
- **Database:** PostgreSQL
- **JDBC:** For database connectivity
- **Development Tools:** IntelliJ IDEA, Git

---

## Setup Instructions

### Prerequisites
1. Install **Java JDK 17** or later.
2. Install **PostgreSQL** and set up a database.

### Database Setup
1. Create a database named `employee_db` in PostgreSQL:
   ```sql
   CREATE DATABASE employee_db;

### How to Run the Application
Configure the Database Connection
Open the EmployeeData class.
1. Update the database connection details:
   ```java
   private static final String URL = "jdbc:postgresql://localhost:5432/employee_db";
   private static final String USER = "your_db_username";
   private static final String PASSWORD = "your_db_password";

2. Build and Run

Compile the project:

If using IntelliJ IDEA, click the green Run button next to the Main class.

Verify output in the console. You should see messages indicating database connections and operations (e.g., employee created, updated, or deleted).
