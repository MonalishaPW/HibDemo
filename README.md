HibDemo (Hibernate Demo Project)

📌 Project Overview

HibDemo is a simple Java application built using Hibernate ORM to demonstrate basic database operations with MySQL. This project shows how to configure Hibernate, map an entity class, and perform CRUD-related operations using Eclipse and Maven.

This project is mainly created for learning and practice purposes.


---

🛠️ Technologies Used

Java (JDK 8 / JavaSE-1.8)

Hibernate ORM

MySQL Database

Maven

Eclipse IDE



---

📂 Project Structure

HibDemo
│── src/main/java
│   └── com.pwskills.HibDemo
│       ├── App.java
│       ├── Student.java
│       └── HibConfig.java
│
│── src/main/resources
│   └── hibernate.cfg.xml
│
│── target/
│── .settings/
│── .classpath
│── .project
│── pom.xml


---

📄 Description of Files

App.java – Main class to run the application

Student.java – Entity class mapped with Hibernate annotations

HibConfig.java – Hibernate configuration helper class

hibernate.cfg.xml – Hibernate configuration file (DB connection, dialect, mappings)

pom.xml – Maven configuration and dependencies



---

⚙️ Functionality Demonstrated

Creating Hibernate configuration

Building SessionFactory

Opening Hibernate session

Performing
