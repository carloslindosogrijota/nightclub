# NightClub Management System 🪩


## Overview
The NightClub Management System is a Java application designed to manage a nightclub's operations, including guest management, table assignments, and order processing. This system helps nightclub staff maintain control over guests, tables, and revenue.


## Features
- *Guest Management*: Add and verify guests based on age (must be 18+)
- *Table Management*: 
  - Track availability of regular and VIP tables
  - Assign guests to tables
  - View all available tables
- *Order Processing*:
  - Create and assign drink orders to tables
  - Calculate costs for individual tables
  - Track total revenue for the venue
- *Administrative Functions*:
  - Free up tables at the end of the night
  - Generate reports on guests who attended

## System Structure

### Main Classes
- NightclubApplication: The main application class that orchestrates the system
- NightClub: Represents the nightclub entity containing guests, tables, and orders
- Guest: Represents a nightclub guest with attributes like age, ID, and table assignments
- Table: Represents a table in the nightclub with attributes like capacity and VIP status
- Order: Represents a drink order with a specific price
- Utils: Contains utility methods for managing the nightclub operations

### Key Methods
- addGuests: Verifies guest eligibility and adds them to the nightclub
- listAvailableTables: Displays all tables that are currently available
- tableManagment: Assigns a table to a guest
- tablesOrders: Associates drink orders with specific tables
- orderTotalPriceOfTable: Calculates the total cost of orders for a specific table
- viewEarnings: Shows the total revenue for the nightclub
- liberateTables: Frees up all tables at the end of the night
- assistedGuests: Lists all guests who attended the nightclub

## Requirements
- Java 8 or higher
- No additional libraries or dependencies required

## Installation
1. Clone the repository
2. Compile the Java files
3. Run the NightclubApplication class

## Project Structure
````
uax/
└── oop/
    └── nightclub/
        ├── NightclubApplication.java
        ├── models/
        │   ├── Guest.java
        │   ├── NightClub.java
        │   ├── Order.java
        │   └── Table.java
        └── utils/
            └── Utils.java 
````

## Future Enhancements
- Implement a graphical user interface
- Add a database for persistent storage
- Implement a reservation system
- Integrate with payment processing systems
- Add staff management functionality

## License
This project is licensed under the MIT License - see the LICENSE file for details.
