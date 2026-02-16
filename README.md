# Spring Boot Thymeleaf Portfolio

A clean, modular, and professional **personal portfolio web application** built using **Spring Boot** and **Thymeleaf**.  
This project follows **industry-standard MVC architecture**, reusable Thymeleaf fragments, and a master layout design.

---

## 🚀 Features

- Spring Boot 4.x based web application
- Thymeleaf templating engine
- Master layout with reusable fragments (Navbar, Footer, Pages)
- Modular page structure (Home, Resume, Projects, Contact)
- Bootstrap-based responsive UI
- Clean controller-layer separation
- Production-ready project structure

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 4.0.2**
- **Spring MVC**
- **Thymeleaf**
- **Bootstrap 5**
- **Maven**

---

## 📂 Project Structure
```
src
└── main
├── java
│ └── com.mohsin.portfolio
│ └── controller
│ └── HomeController.java
└── resources
├── static
│ ├── css
│ ├── js
│ └── images
└── templates
├── master.html
└── fragments
├── menu.html
├── footer.html
├── home.html
├── resume.html
├── projects.html
└── contact.html
```






---

## 🧠 Architecture Highlights

- **Single master layout** (`master.html`)
- **Reusable Thymeleaf fragments**
- Controller-driven page rendering
- No duplicate HTML structure across pages
- Clean separation of concerns

---

## ▶️ How to Run the Project

### Prerequisites
- Java 17+
- Maven
- IDE (IntelliJ / Eclipse / VS Code)

### Steps
```bash
git clone https://github.com/<your-username>/spring-boot-thymeleaf-portfolio.git
cd spring-boot-thymeleaf-portfolio
mvn spring-boot:run
```
- Open browser:
```
http://localhost:8080/
```



- Available Routes
```
| URL            | Page     |
| -------------- | -------- |
| `/` or `/home` | Home     |
| `/resume`      | Resume   |
| `/projects`    | Projects |
| `/contact`     | Contact  |

```

### 👨‍💻 Author
```
Md Mohsin Haider
Java Full Stack Developer
Spring Boot | REST APIs | Thymeleaf | React | MERN Stack

```
### License

- This project is licensed under the MIT License.
- You are free to use, modify, and distribute this project.

### Acknowledgements

- Spring Boot Team
- Thymeleaf Community
- Start Bootstrap (UI inspiration)

### Future Enhancements

- Database integration (MySQL / PostgreSQL)
- Admin dashboard
- Authentication & authorization
- REST API version
- Docker support















