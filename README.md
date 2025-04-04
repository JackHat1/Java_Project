# 📘 Object Oriented Programming Course Project
This is a university course project for the **Object Oriented Programming** class.


# 🎬 Netflix-Like Streaming Platform (Java OOP Project)

A complete **Java-based console application** simulating a mini Netflix platform using core **Object-Oriented Programming** principles like inheritance, polymorphism, encapsulation, and abstraction.

## 📦 Project Overview

This project allows you to:
- Manage **movies and series**
- Handle **subscribers** with various subscription plans
- Track **watch history**
- Generate **personalized recommendations** based on favorite genres

> Built entirely in Java 17, with a focus on **clean code**, **reusability**, and **modularity**

---

## 🚀 Features

### 🧩 Content Management
- Add Movies and Series (`ContentRepository`)
- Add, remove, and update episodes (`Series`)
- Auto-increment content IDs

### 👥 Subscriber Management
- Add new subscribers
- Activate / Deactivate accounts
- Watch content (up to 10 recent)
- Add favorite genres (max 3)
- View full profile and watch history

### 🔍 Recommendations Engine
- Generate movie recommendations by matching genres
- Sort by **most recent additions (higher ID)**

---

## 🛠 Technologies

- Java 17+
- Object-Oriented Programming
- No external libraries
- Console-based output

---

## 📁 Project Structure

```
Java_Project/
├── backend/
│   ├── content/             # Content base class, Movie, Series
│   ├── subscription/        # Subscriber & SubscriptionPlan
│   ├── repository/          # ContentRepository & SubscriberRepository
│   └── service/             # NetflixService for logic
├── frontend/
│   └── NetflixDriver.java   # Main driver to demonstrate all functionality
└── README.md
```

---

## 📸 Sample Output

```
alice@example.com watched Interstellar
alice@example.com watched Breaking Bad
...

? Active Status: Active
? Favorite Genres: Sci-Fi, Crime
...

Movies Recommended for Subscriber bob@example.com
- Interstellar (? 4.75)
- Mad Max: Fury Road (? 4.75)
```

---

## 🧠 Concepts Applied

- ✅ Encapsulation
- ✅ Inheritance & Polymorphism
- ✅ Abstraction (NetflixService)
- ✅ Input Validation
- ✅ Defensive Programming

---

## 📚 Credits

Project developed for **COMP102 - Object-Oriented Programming** course.  

---

## 📄 License

MIT License - Free for academic and personal use.
