
# Object Oriented Programming Course Project

This repository contains the source code for a university course project developed for the **Object Oriented Programming (COMP102)** class.

## Project Title: Netflix-Like Streaming Platform (Java OOP Project)

A complete Java-based console application simulating a simplified Netflix-like platform, utilizing fundamental Object-Oriented Programming principles including inheritance, polymorphism, encapsulation, and abstraction.

## Project Overview

The application supports the following features:
- Management of movies and series
- Subscriber handling with various subscription plans
- Tracking and displaying watch history
- Generation of personalized recommendations based on favorite genres

The project is implemented entirely in Java 17, with emphasis on clean code practices, reusability, and modular design.

## Features

### Content Management
- Add movies and series using `ContentRepository`
- Manage episodes in series (add, remove, update)
- Automatic content ID generation

### Subscriber Management
- Register new subscribers
- Activate or deactivate accounts
- Record viewing history (up to 10 recent entries)
- Add favorite genres (maximum of 3)
- Display subscriber profile and viewing history

### Recommendations Engine
- Generate recommendations based on matching favorite genres
- Results prioritized by most recently added content (higher ID)

## Technologies Used

- Java 17+
- Object-Oriented Programming concepts
- No external dependencies or libraries
- Console-based user interface

## Project Structure

```
Java_Project/
├── backend/
│   ├── content/             # Base content classes (Content, Movie, Series)
│   ├── subscription/        # Subscriber and SubscriptionPlan classes
│   ├── repository/          # ContentRepository and SubscriberRepository
│   └── service/             # NetflixService for business logic
├── frontend/
│   └── NetflixDriver.java   # Main driver to demonstrate system functionality
└── README.md
```

## Sample Output

```
alice@example.com watched Interstellar
alice@example.com watched Breaking Bad

Active Status: Active
Favorite Genres: Sci-Fi, Crime

Movies Recommended for Subscriber bob@example.com
- Interstellar (4.75)
- Mad Max: Fury Road (4.75)
```

## Key Concepts Demonstrated

- Encapsulation
- Inheritance and Polymorphism
- Abstraction (NetflixService logic)
- Input validation
- Defensive programming techniques

## License

MIT License - This project is free for academic and personal use.
