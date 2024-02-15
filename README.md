# Car Management System 🚗

This web-based application is designed for managing a car inventory, allowing users to add, display, update, and delete car details seamlessly. Built with Java Servlets, Hibernate, and JSP, it's a robust solution for car dealerships or personal collections.

## 📋 Description

The Car Management System simplifies car inventory management through a user-friendly web interface. It supports CRUD operations, providing an efficient way to handle car data.

## 🚀 Getting Started

### Prerequisites

- Java JDK 8+
- Apache Tomcat Server 9.0+
- MySQL Database Server
- Eclipse or any Java IDE supporting Servlet development
- Maven

### Installation

1. **Clone the repository:**
     bash
     git clone <repository-url>
2. **Open the project in your IDE.**

3. **Configure Tomcat Server with the project.**

4. **Set up a MySQL database named `carproject_servlet`. Update `hibernate.cfg.xml` with your database credentials:**

     <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/carproject_servlet</property>
     <property name="hibernate.connection.username">root</property>
     <property name="hibernate.connection.password">root</property>


5. **Run the project on Tomcat Server.**

### Executing Program

- Access the web application at `http://localhost:8080/CarManagementSystem`.
- Navigate through the web interface to manage car entries.

## 📐 Usage

- **Add a New Car:** Fill in the car details in the provided form to add a new car to the database.
- **Display All Cars:** View a list of all cars in the database, with options to update or delete entries.

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the project.
2. Create a feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a pull request.

## 💳 Credits

Developed by Vivek Kumar.

## 📄 License

This project is licensed under the MIT License - see the LICENSE.md file for details.
