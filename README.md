# Healthcare System (Java JDBC + PostgreSQL)

This project is a simple Healthcare Management System built using Java and PostgreSQL.
It demonstrates JDBC database connectivity and basic CRUD operations.

## Technologies Used
- Java 25
- PostgreSQL 17
- JDBC (PostgreSQL Driver)
- IntelliJ IDEA

## Features
- Connect to PostgreSQL database
- Add patients to database
- View all patients
- Delete patients by ID

## Database Structure

Table: patient

Columns:
- patient_id (SERIAL PRIMARY KEY)
- name (VARCHAR)
- age (INT)

## How to Run

1. Open project in IntelliJ IDEA
2. Make sure PostgreSQL is running
3. Update database credentials in DatabaseConnection.java
4. Run Main.java

## Example Output

Patient added successfully  
1 | Aisamal | 18  
2 | Eldiyar | 20  

## Author
Aisamal Toleumuratova
