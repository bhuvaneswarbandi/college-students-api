# 🎓 College Students API

Spring Boot REST API for managing student records with MySQL and JPA.

---

## 📌 Endpoints

- `POST /students` – Add a new student  
- `POST /students/batch` – Add multiple students at once  
- `GET /students` – Fetch all students  
- `GET /students/{id}` – Fetch student by ID  

---

## 📥 Sample Request Bodies

### ➕ Add Single Student
```json
{
  "name": "Alice",
  "email": "alice@example.com",
  "course": "CSE",
  "year": 3
}
```

### ➕ Add Multiple Students
[
  {
    "name": "Rosy",
    "email": "rosy@example.com",
    "course": "CSE",
    "year": 3
  },
  {
    "name": "Charlie",
    "email": "charlie@example.com",
    "course": "ECE",
    "year": 2
  }
]

### 🚀 How to Run
Start MySQL and ensure the college_students database exists:
CREATE DATABASE college_students;

### Then configure your database credentials in the file:
src/main/resources/application.properties

### Run the application using:
./mvnw spring-boot:run
