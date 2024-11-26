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
  ![Снимок экрана 2024-11-26 180248](https://github.com/user-attachments/assets/dc496a57-9401-4bbd-92f2-2a32f97451ad)
- Retrieve employee information by ID or view all employees.
 ![Снимок экрана 2024-11-26 175208](https://github.com/user-attachments/assets/ae152fdb-03e7-4e9e-b279-82e4b790da97)
 ![Снимок экрана 2024-11-26 175414](https://github.com/user-attachments/assets/d1b62350-0f44-4382-99ee-8007c8e90da5)
- Update existing employee details.
   ![Снимок экрана 2024-11-26 175829](https://github.com/user-attachments/assets/2575a937-1d7e-4c44-8c24-05e7571f9bba)
- Delete employees from the database.
   ![Снимок экрана 2024-11-26 180342](https://github.com/user-attachments/assets/e11ba824-c4fc-4885-afe5-0aac46d6cfb4)

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
