🛒 ClickCart – E-Commerce Application (Java Spring Boot)
Welcome to ClickCart, a simple and functional e-commerce web application built using Spring Boot. It includes features like product listings, user login, and a purchase system — perfect for learning full-stack Java development!

🚀 What’s Inside?
🛍️ Product Listing Page

🔐 User Authentication (Login & Sign-up)

🧾 Purchase and Order System

🗄️ H2 In-Memory Database (resets on each restart)

✅ Prerequisites
Before you run the project, make sure you have:

JDK 21 installed

No need to install Maven manually!
The project uses the built-in Maven Wrapper (./mvnw)

🔧 Building the Project
Use the Maven Wrapper to clean and package the app:

bash
Copy
Edit
./mvnw clean package
✅ Recommended approach for consistency across all environments.

▶️ Running the Application
Start the app in just two steps:

bash
Copy
Edit
cd demo     # Replace 'demo' with the actual folder name/path
./mvnw spring-boot:run
🗃️ Database Info – H2 Console
ClickCart uses H2 In-Memory Database, so everything resets on each restart.

To access the database:

Start the app.

Open your browser and go to:
http://localhost:8080/h2-console

Use the following credentials:

Username: sa

JDBC URL: (Check application.properties  or console after running the project for the correct one )

💡 Tips
The H2 Console is great for testing — you can view and modify data in real time!

Since the database resets, use the UI to add fresh data after restarting the app.

📁 Folder Structure (Basic Overview)
pgsql
Copy
Edit
ClickCart/
├── src/
│   ├── main/
│   │   ├── java/     # Java code (Controllers, Models, Repositories)
│   │   └── resources/  # application.properties, templates, static
├── .mvn/             # Maven Wrapper files
├── mvnw / mvnw.cmd   # Maven Wrapper executables
└── pom.xml           # Project configuration
👨‍💻 Made with ❤️ by Hrishikesh
Java Developer
