# 🚀 Guardrail API (User Management System)

A Spring Boot REST API for managing users with full CRUD operations, validation, exception handling, and Swagger documentation.

---

## 📌 Features

* ✅ Create User
* ✅ Get All Users
* ✅ Get User by ID
* ✅ Update User
* ✅ Delete User
* ✅ Input Validation
* ✅ Global Exception Handling
* ✅ Swagger UI for API Testing

---

## 🛠 Tech Stack

* Java 17
* Spring Boot 3
* Spring Data JPA
* PostgreSQL / H2
* Maven
* Swagger (OpenAPI)

---

## 📂 Project Structure

```bash
controller/     → API endpoints
service/        → Business logic
repository/     → Database access
entity/         → Database model
dto/            → Data transfer objects
exception/      → Error handling
config/         → Swagger configuration
```

---

## 🔗 API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| POST   | /users      | Create user    |
| GET    | /users      | Get all users  |
| GET    | /users/{id} | Get user by ID |
| PUT    | /users/{id} | Update user    |
| DELETE | /users/{id} | Delete user    |

---

## 📬 Example Request

```json
{
  "username": "Chetan",
  "email": "chetan@gmail.com",
  "premium": true
}
```

---

## 📥 Example Response

```json
{
  "id": 1,
  "username": "Chetan",
  "email": "chetan@gmail.com",
  "premium": true
}
```

---

## 📖 Swagger UI

Run the application and open:

```
http://localhost:8080/swagger-ui/index.html
```

---

## ▶️ How to Run

```bash
mvn spring-boot:run
```

---

## 🧠 What I Learned

* Layered architecture (Controller → Service → Repository)
* DTO pattern
* Validation using annotations
* Exception handling
* REST API design
* Swagger integration

---

## 👨‍💻 Author

Chetan
