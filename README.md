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

```
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
```
---
Dependancies:

<img width="840" height="818" alt="Dependancies" src="https://github.com/user-attachments/assets/c08058ed-39a7-48f7-8516-5764e4034dc8" />
---


# STS Output:

![STS output](https://github.com/user-attachments/assets/5045bb52-dc35-452b-8f20-c214748f22b6)

---

Postman Output:

<img width="1820" height="980" alt="postmanOutput" src="https://github.com/user-attachments/assets/93e223c1-57d2-4cdf-ada6-4f85a884345e" />

---

Database Output:

<img width="1820" height="980" alt="databaseOutput" src="https://github.com/user-attachments/assets/4830048a-d065-4850-b076-20ad698df3a1" />

---

Frontend Output:

<img width="1785" height="912" alt="HTML output" src="https://github.com/user-attachments/assets/03ca462b-b19e-4ec5-8ab4-ddbda25a6ecd" />

<img width="1867" height="543" alt="HTML output1" src="https://github.com/user-attachments/assets/0bace7f8-2ea9-4236-8304-64b442593cde" />


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

