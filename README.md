ClickCart E-Commerce Application
A Java Spring Boot-based e-commerce application with product listing, user authentication and a purchase system.
Prerequisites
Ensure the following dependencies are installed:
JDK 21 (Java Development Kit)
Maven (Not required to download maven externally. As project is using the Maven Wrapper provided in the project itself)
Building the Project
./mvnw clean package   (Recommended)
Run the Application:-
Using Maven Wrapper (Recommended)
Use this command in terminal- 
1) cd demo  (PATH TO THE PROJECT)
2) ./mvnw spring-boot:run
Database
The project uses an H2 in-memory database, which resets on every restart.
To access the H2 console:
Start the application
Open: http://localhost:8080/h2-console
user:sa
Use the default JDBC URL provided in application.properties.
