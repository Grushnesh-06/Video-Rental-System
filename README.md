# Video-Rental-System
Video Rental Store Inventory Control System using Java

# Video Inventory Management System

This project is a simple **Video Inventory Management System** implemented in Java. In the same way, we can create an **E-Library for Book Rentals** by modifying the inventory system to handle books instead of videos.

## Description
The Video Inventory Management System allows users to manage a collection of videos efficiently. It provides functionalities to add videos, mark them as rented or returned, remove videos from the inventory, and display the available videos.

## Features
- **Add New Video**: Users can add videos with an ID, title, and genre.
- **Mark Video as Rented**: Rent out a video by marking it as rented.
- **Mark Video as Returned**: Change the status of a rented video back to available.
- **Remove Video from Inventory**: Delete a video from the system.
- **Display Inventory**: View all videos in the inventory along with their status.
- **Exit System**: Allows the user to exit the application.

## Technologies Used
- **Language**: Java
- **Libraries**: `java.util.Scanner`

## How It Works
1. The user is presented with a menu containing different options:
   - Add a new video
   - Rent a video
   - Return a video
   - Remove a video
   - Display inventory
   - Exit
2. The user selects an option and provides the required details.
3. The system processes the request and updates the inventory accordingly.
4. The inventory is displayed in a structured format when requested.

## Usage
1. Compile and run the Java file:
   ```bash
   javac exp2.java
   java exp2
   ```
2. Follow the menu prompts to manage the video inventory.

## Future Improvements
- Implement search functionality to find videos quickly.
- Introduce data persistence to store video records in a file or database.
- Expand the system to support **E-Library Book Rentals** with similar functionalities for books.

---
This project demonstrates a basic inventory management system for videos. With minor modifications, it can be adapted to manage book rentals for an **E-Library System**.

