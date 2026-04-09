# 🚀 Student Management System (Spring Boot)

A backend REST API project built using **Java + Spring Boot** that allows managing student records with full CRUD operations. This project follows clean architecture using DTO layer, service layer, and repository pattern.

---

## 📌 Features

* ✅ Create Student
* ✅ Get All Students
* ✅ Get Student by ID
* ✅ Update Student
* ✅ Delete Student
* ✅ DTO Layer (Clean Architecture)
* ✅ Exception Handling
* ✅ MySQL Database Integration

---

## 🛠 Tech Stack

* **Backend:** Java, Spring Boot
* **Database:** MySQL
* **ORM:** Spring Data JPA (Hibernate)
* **Build Tool:** Maven
* **Tools:** Postman, Git, IntelliJ IDEA

---

## 📁 Project Structure

```
student-management/
│
├── src/main/java/com/ronit/studentmanagement/
│
│   ├── controller/
│   │   └── StudentController.java
│
│   ├── service/
│   │   ├── StudentService.java
│   │   └── StudentServiceImpl.java
│
│   ├── repository/
│   │   └── StudentRepository.java
│
│   ├── entity/
│   │   └── Student.java
│
│   ├── dto/
│   │   └── StudentDto.java
│
│   ├── mapper/
│   │   └── StudentMapper.java
│
│   ├── exception/
│   │   └── ResourceNotFoundException.java
│
│   └── StudentManagementApplication.java
│
├── src/main/resources/
│   └── application.properties
│
└── pom.xml
```

---

## ⚙️ Setup Instructions

### 1. Clone Repository

```bash
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```

### 2. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

### 3. Run Application

```bash
mvn spring-boot:run
```

---

## 📡 API Endpoints

### ➤ Create Student

```
POST /api/students
```

```json
{
  "name": "Ronit",
  "email": "ronit@gmail.com",
  "course": "MCA"
}
```

---

### ➤ Get All Students

```
GET /api/students
```

---

### ➤ Get Student by ID

```
GET /api/students/{id}
```

---

### ➤ Update Student

```
PUT /api/students/{id}
```

---

### ➤ Delete Student

```
DELETE /api/students/{id}
```

---

## 🧠 Concepts Used

* Object-Oriented Programming (OOP)
* REST API Design
* DTO Pattern
* Layered Architecture
* Exception Handling
* Database Integration

---

## 📸 Testing

All APIs tested using **Postman**.

---

## 🚀 Future Improvements

* 🔐 JWT Authentication
* 📊 Swagger API Documentation
* ✅ Validation using @Valid
* 🌐 Frontend Integration

---

## 👨‍💻 Author

**Ronit Khupase**
📍 Pune, India
🔗 https://github.com/ronit-khupase

---

## ⭐ If you like this project

Give it a ⭐ on GitHub — it helps!
