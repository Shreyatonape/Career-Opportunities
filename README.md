# 🎓 Career Opportunities 

A simple and effective Spring Boot REST API backend that provides various career opportunities for students after completing SSC (10th grade). The project is built using **Java 17**, **Spring Boot**, and **PostgreSQL**, and follows the **MVC architecture**.

---

## 👨‍💻 Team Members

- Shreya Shankar Tonape
- Sakshi Shivaji Khandagale

---

- ## ⚙️ Tech Stack

- Java 17  
- Spring Boot 3.2.3  
- Spring Web (REST APIs)  
- Spring Data JPA  
- PostgreSQL  
- Postman (API testing)

 --- 
 ## 🗂️ Project Structure

''''
src/
└── main/
├── java/
│ └── com.ssc.career/
│ ├── controller/ # REST API controllers
│ ├── entity/ # JPA entity (CareerOpportunity)
│ ├── repository/ # JpaRepository interface
│ └── service/ # Business logic layer (if added)
└── resources/
└── application.properties # DB configurations
''''

# STS Output:


---

## 📌 Features

- 🔍 View all career opportunities  
- 📄 View details of a career option by ID

----

▶️ How to Run the Project

📦 Prerequisites

JDK 17
PostgreSQL (Running and accessible)
Maven or STS/IntelliJ


🛠️ Steps

1) Clone the project
   git clone https://github.com/your-username/career-opportunities.git
cd career-opportunities


 2) Create PostgreSQL DB
   CREATE DATABASE career_db;


 3) Configure application.properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/career_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true


4) Run the app
./mvnw spring-boot:run

---

📫 Contact

   Shreya Tonape
   
   📧 shreyatonape65@gmail.com

   Sakshi Khandagale
   
   📧 sakshikhandagale0707@gmail.com

---

