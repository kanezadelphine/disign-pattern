# Design Patterns in Practice — Lab 2.2

## Project Overview

This project demonstrates the practical implementation of **Design Patterns** in Java using a real-world scenario involving **Notification Management**, **Payment Processing**, and **Order Event Handling**.

The project applies three major design patterns from the Gang of Four (GoF):

* **Builder Pattern**
* **Strategy Pattern**
* **Observer Pattern**

These patterns improve code flexibility, maintainability, and scalability.

---

# Objectives

* Apply creational design patterns to object construction.
* Apply behavioral design patterns to dynamic behavior changes.
* Build modular and reusable components using Java.

---

# Design Patterns Implemented

## 1. Builder Pattern — Notification Message

The Builder Pattern is used to create complex `NotificationMessage` objects with optional fields and validation.

### Features

* Fluent method chaining
* Input validation before object creation
* Cleaner object construction

### Example

```java
NotificationMessage message = new NotificationMessage.Builder()
        .to("user@email.com")
        .subject("Welcome")
        .body("Hello User")
        .priority(Priority.HIGH)
        .attach("file.pdf")
        .build();
```

### Validation Rules

* Recipient must not be empty
* Body must not be empty

---

## 2. Strategy Pattern — Payment Processing

The Strategy Pattern allows switching payment processing logic at runtime.

### Payment Methods Implemented

* Credit Card
* Bank Transfer
* Mobile Money

Each strategy has:

* Its own processing logic
* Fee calculation
* Validation rules

### Example

```java
PaymentProcessor processor = new PaymentProcessor(new CreditCardStrategy());

processor.process(new PaymentRequest(100));

processor.setStrategy(new MobileMoneyStrategy());
processor.process(new PaymentRequest(100));
```

### Benefits

* Easy to add new payment methods
* Runtime flexibility
* Clean separation of algorithms

---

## 3. Observer Pattern — Order Event Bus

The Observer Pattern is used to notify multiple components when an order event occurs.

### Supported Events

* ORDER_PLACED
* ORDER_SHIPPED
* ORDER_DELIVERED
* ORDER_CANCELLED

### Observers Implemented

* EmailNotifier
* InventoryUpdater
* AuditLogger

### Example

```java
OrderEventBus bus = new OrderEventBus();

bus.subscribe(new EmailNotifier());
bus.subscribe(new InventoryUpdater());
bus.subscribe(new AuditLogger());

bus.publish(order, OrderEvent.ORDER_PLACED);
```

### Benefits

* Loose coupling
* Easy event broadcasting
* Scalable event-driven architecture

---

# Project Structure

```bash
Design Patterns in Practice/
│
├── src/
│   └── lab/
│       ├── builder/
│       ├── strategy/
│       └── observer/
│
└── test/
    ├── builder/
    ├── strategy/
    └── observer/
```

---

# Technologies Used

* Java
* IntelliJ IDEA
* JUnit 5

---

# How to Run

1. Open project in IntelliJ IDEA.
2. Compile Java files.
3. Run test classes inside the `test` folder.
4. Verify outputs in console.

---

# Expected Learning Outcomes

By completing this lab, the following concepts are demonstrated:

* Object creation using Builder Pattern
* Dynamic algorithm switching using Strategy Pattern
* Event notification using Observer Pattern

---

# Author

Student Lab Project — Design Patterns in Practice
