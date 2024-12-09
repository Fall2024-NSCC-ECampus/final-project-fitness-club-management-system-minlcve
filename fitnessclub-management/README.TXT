# Fitness Club Management System

## Overview
The **Fitness Club Management System** is a web application designed for managing gym memberships, trainers, schedules, and attendance. The system allows the following users to perform specific actions:

- **Admin**: Manages members and trainers, updates schedules, and modifies user data.
- **Member**: Logs in to view their schedule and manage personal details.
- **Trainer**: Logs in to mark attendance and check the schedule.

This project is built using **Java** and **Spring Boot** and uses **Thymeleaf** for the frontend.

## Features

### Admin Features:
- **Login**: Admin can log in using credentials.
- **Add Member**: Admin can add new members to the gym.
- **Delete Member**: Admin can delete unwanted members.
- **Add Trainer**: Admin can add a new trainer.
- **Delete Trainer**: Admin can remove unwanted trainers.
- **Modify Member Data**: Admin can update member information.
- **Modify Trainer Shift**: Admin can update trainers' shifts.

### Member Features:
- **Login**: Members can log in using their credentials.
- **Schedule**: Members can view the gym schedule.

### Trainer Features:
- **Login**: Trainers can log in using credentials.
- **Attendance**: Trainers can mark attendance for the members.
- **Schedule**: Trainers can check their schedule.

## Technologies Used
- **Java**: For backend logic.
- **Spring Boot**: For setting up the backend application.
- **Thymeleaf**: For dynamic HTML rendering.
- **Spring Security**: For user authentication and authorization.
- **MySQL**: For database management.
- **Maven**: For dependency management and project building.

## Project Structure

```
fitnessclub-management
└── src
    └── main
        └── java
            └── com
                └── fitnessclub
                    └── management
                        ├── controller
                        │   ├── AdminController.java
                        │   ├── MemberController.java
                        │   ├── TrainerController.java
                        │   └── PageController.java
                        ├── service
                        │   ├── AdminService.java
                        │   ├── MemberService.java
                        │   ├── TrainerService.java
                        │   ├── ScheduleService.java
                        │   └── AttendanceService.java
                        ├── model
                        │   ├── Member.java
                        │   ├── Trainer.java
                        │   ├── Admin.java
                        │   ├── Schedule.java
                        │   └── Attendance.java
                        └── repository
                            ├── AdminRepository.java
                            ├── MemberRepository.java
                            ├── TrainerRepository.java
                            ├── ScheduleRepository.java
                            └── AttendanceRepository.java
```

## How to Run the Project

### Prerequisites:
- **JDK 11 or higher**
- **Maven**
- **MySQL Database** (Make sure to create a database and update the credentials in `application.properties` file).

### Steps to Run:
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/fitnessclub-management.git
   ```

2. Navigate to the project directory:
   ```
   cd fitnessclub-management
   ```

3. Update the `application.properties` with your MySQL credentials:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/fitnessclub
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```

4. Build the project using Maven:
   ```
   mvn clean install
   ```

5. Run the application:
   ```
   mvn spring-boot:run
   ```

6. Open a web browser and go to:
   ```
   http://localhost:8080
   ```

## Endpoints
- **/login**: Login page for Admin, Member, and Trainer.
- **/admin**: Admin Dashboard for managing members and trainers.
- **/member**: Member Dashboard for viewing schedule and personal details.
- **/trainer**: Trainer Dashboard for marking attendance and viewing the schedule.
