# MVC Registration Application (Servlet + JSP + JDBC)

A simple Java Web Application built using the **MVC (Model-View-Controller)** design pattern. This project demonstrates how a user registration system works by integrating **JSP**, **Servlets**, **JDBC**, and **MySQL**.

The primary goal of this project is to understand the responsibilities of each MVC component and how they interact to process a user request.

---

# 🏗 MVC Architecture

```
                        MVC - Servlet, JSP Application

+------------------+         +----------------------+         +----------------------+         +----------------+
|      VIEW        |         |     CONTROLLER      |         |        MODEL         |         |   DATABASE     |
|------------------|         |----------------------|         |----------------------|         |----------------|
|  index.jsp       | ----->  | RegisterServlet.java| ----->  | UserModel.java       | ----->  |   MySQL DB     |
|  HTML Form       | Request |                      | setData | - Fields             |  Query  |  UserInfo      |
|                  |         | - Reads Form Data   |         | - Getters/Setters    |         |                |
| Name             |         | - Validation        |         | - Business Logic     |         |                |
| Email            |         | - Calls Model       |         | - JDBC Operations    |         |                |
| Password         |         |                      |         |                      |         |                |
+------------------+         +----------------------+         +----------------------+         +----------------+
        ▲                               |                               ▲
        |                               |                               |
        |                               | getData                       |
        |                               |                               |
        |                               ▼                               |
        |                    +---------------------+                    |
        |                    | success.jsp         |                    |
        |                    | failure.jsp         |                    |
        +--------------------+---------------------+--------------------+
                              Response to User
```

---

# 📁 Project Structure

```
MVC-Registration-App
│
├── src
│   ├── controller
│   │      RegisterServlet.java
│   │
│   ├── model
│   │      UserModel.java
│   │
│   └── util
│          DBConnection.java
│
├── WebContent
│   ├── index.jsp
│   ├── success.jsp
│   └── failure.jsp
│
└── MySQL Database
       UserInfo Table
```

---

# 🔄 Application Flow

### Step 1 – User Opens the Registration Page

The user accesses **index.jsp**, which displays a registration form containing:

- Name
- Email
- Password

---

### Step 2 – Form Submission

After filling in the details, the user clicks the **Register** button.

The browser sends an HTTP **POST** request to the servlet.

```
index.jsp
      │
      ▼
RegisterServlet
```

---

### Step 3 – Controller (Servlet)

The servlet acts as the **Controller**.

Responsibilities:

- Receives the HTTP request
- Reads form data using `request.getParameter()`
- Performs validation (if required)
- Creates a Model object
- Stores user data in the Model using setters
- Calls the Model to interact with the database

Example:

```java
String name = request.getParameter("uname");
String email = request.getParameter("uemail");
String password = request.getParameter("upassword");
```

---

### Step 4 – Model

The Model contains:

- User data
- Business logic
- Database operations

Example responsibilities:

- Store user details
- Connect to MySQL
- Insert data using JDBC
- Return success or failure

The Model communicates with the database using:

- JDBC
- DriverManager
- Connection
- PreparedStatement
- executeUpdate()

---

### Step 5 – Database

The Model sends an SQL query to MySQL.

```
INSERT INTO UserInfo(name,email,password)
VALUES(?,?,?)
```

If insertion succeeds:

```
return true;
```

Otherwise:

```
return false;
```

---

### Step 6 – Response

The servlet receives the result from the Model.

If successful:

```
success.jsp
```

Otherwise:

```
failure.jsp
```

Finally, the JSP page is displayed to the user.

---

# 📚 Technologies Used

- Java
- JSP (JavaServer Pages)
- Servlets
- JDBC
- MySQL
- Apache Tomcat
- Eclipse IDE
- HTML

---

# 📖 Concepts Learned

## JSP

- JSP Directives
- Scriptlet Tag
- Declaration Tag
- Expression Tag

## Servlets

- Servlet Lifecycle
- `service()`
- `doGet()`
- `doPost()`
- `HttpServletRequest`
- `HttpServletResponse`
- `PrintWriter`

## MVC Architecture

- View
- Controller
- Model
- Separation of Concerns

## JDBC

- Loading MySQL Driver
- Database Connection
- PreparedStatement
- Parameterized Queries
- executeUpdate()
- Resource Management

## Database

- User Registration
- Insert Operation
- SQL Queries

---

# 🎯 Purpose

This project was built to understand how a real-world Java Web Application is organized using the **MVC architecture**.

Instead of writing all the logic inside a single Servlet or JSP, the application is divided into three layers:

- **View** → Displays information to the user.
- **Controller** → Handles user requests and application flow.
- **Model** → Contains business logic and interacts with the database.

This separation makes the application easier to maintain, test, and extend.

---


# 📝 Note

This repository is part of my Java Web Development learning journey. The focus is on understanding the MVC pattern, Servlet-JSP communication, and JDBC integration through simple, hands-on examples before moving on to enterprise frameworks like Spring Boot.

> **Learn → Understand → Build → Refactor → Repeat** 🚀