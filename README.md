# College Admission Management System

## Project Overview

The College Admission Management System (CAMS) is a Java-based
Object-Oriented Programming project developed to manage the
college admission process.

The system demonstrates important Object-Oriented Programming
concepts such as encapsulation, inheritance, polymorphism and
abstraction.

---

## Project Features

- User registration and login
- Applicant profile management
- Applicant document upload
- Application submission
- Course management
- Eligibility verification
- Seat allocation
- Application status tracking
- Payment processing
- Payment receipt generation
- Admission confirmation
- Admission staff management

---

## Technologies Used

- Java
- Object-Oriented Programming
- Visual Studio Code
- Git
- GitHub

---

## Project Structure

```text
oops-assignment-01/
│
├── src/
│   └── cams/
│       ├── User.java
│       ├── Applicant.java
│       ├── Course.java
│       ├── Application.java
│       ├── Payment.java
│       ├── AdmissionStaff.java
│       └── Main.java
│
├── README.md
└── .gitignore


Class Responsibilities
User.java

Represents the basic user of the system.

Responsibilities:

Store user details
Login
Logout
Update profile
Display user details
Applicant.java

Represents a student applying for admission.

Responsibilities:

Store applicant details
Upload documents
Submit application
Track application status
Course.java

Manages available college courses.

Responsibilities:

Store course information
Check applicant eligibility
Manage available seats
Allocate seats
Application.java

Manages the admission application.

Responsibilities:

Connect applicant and course
Verify eligibility
Allocate seat
Update application status
Payment.java

Handles admission fee payment.

Responsibilities:

Process payment
Store payment details
Generate payment receipt
Confirm admission
AdmissionStaff.java

Represents college admission staff.

Responsibilities:

Review applications
Approve applications
Generate admission reports
Main.java

Acts as the main execution class of the system.

It connects the different modules and demonstrates the complete
admission workflow.