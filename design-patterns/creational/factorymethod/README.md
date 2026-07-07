# Factory Method Pattern

## Definition

Factory Method is a creational design pattern that delegates object creation to a factory instead of creating objects directly using the `new` keyword.

---

## Problem

The client directly creates objects.

```
new EmailNotification();
```

This creates tight coupling.

---

## Solution

Move object creation into a Factory.

```
NotificationFactory.createNotification(...)
```

---

## Advantages

- Loose Coupling
- Easy to Extend
- Follows Open Closed Principle
- Cleaner Code

---

## Disadvantages

- More Classes
- Slightly More Complex

---

## Mini Project

Notification Service

Supports:

- Email
- SMS
- Push

---

## Real-world Examples

- Spring BeanFactory
- JDBC DriverManager
- LoggerFactory
- AWS SDK Builders

---

## Folder Structure

Factory Method

├── UML

├── Interview Notes

└── Java Implementation