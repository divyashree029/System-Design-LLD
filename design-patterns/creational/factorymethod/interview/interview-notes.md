# Factory Method Interview Questions & Answers

---

# Basic Questions

## 1. What is Factory Method?

### Answer

Factory Method is a **Creational Design Pattern** that provides an interface (or method) for creating objects while allowing subclasses or a factory class to decide which concrete object to instantiate.

Instead of creating objects directly using the `new` keyword, the client requests the object from a factory.

### Example

```java
Notification notification =
        NotificationFactory.createNotification(NotificationType.EMAIL);
```

The client doesn't know whether an `EmailNotification`, `SMSNotification`, or `PushNotification` object is created.

---

## 2. Why do we use Factory Method?

### Answer

Factory Method is used to separate **object creation** from **business logic**.

Benefits:

- Reduces coupling
- Makes code easier to maintain
- Easy to add new object types
- Promotes code reusability
- Supports Open/Closed Principle

---

## 3. What problem does Factory Method solve?

### Answer

Without Factory Method, client classes create objects directly.

Example:

```java
new EmailNotification();
new SMSNotification();
new PushNotification();
```

As new notification types are added, the client class must keep changing.

Factory Method centralizes object creation inside a factory, eliminating this problem.

---

## 4. Difference between Simple Factory and Factory Method?

### Answer

| Simple Factory | Factory Method |
|---------------|----------------|
| Not an official GoF Design Pattern | Official GoF Design Pattern |
| Usually one factory class | Uses inheritance or dedicated factory methods |
| Easier to implement | More flexible and extensible |
| Less scalable | Highly scalable |

---

## 5. Explain Factory Method with a real-world example.

### Answer

Consider an E-Commerce application.

When an order is placed, users may receive notifications through:

- Email
- SMS
- Push Notification

Instead of creating these objects directly, the Order Service simply asks:

```java
NotificationFactory.createNotification(type);
```

The factory decides which notification object to create.

---

# Intermediate Questions

## 6. Which SOLID principle does Factory Method support?

### Answer

Factory Method primarily supports the **Open/Closed Principle (OCP)**.

A class should be:

- Open for extension
- Closed for modification

Adding a new notification type requires extending the factory instead of modifying business logic.

It also improves adherence to the **Single Responsibility Principle (SRP)** by separating object creation from business logic.

---

## 7. Difference between Factory Method and Abstract Factory?

### Answer

| Factory Method | Abstract Factory |
|---------------|------------------|
| Creates one object | Creates a family of related objects |
| Simpler | More complex |
| One factory method | Multiple factory methods |
| Example: Notification Factory | Example: Windows UI Factory |

---

## 8. What are the advantages of Factory Method?

### Answer

- Loose Coupling
- Centralized object creation
- Easier maintenance
- Easier testing
- Supports Open/Closed Principle
- Cleaner code
- Improves scalability

---

## 9. What are the disadvantages of Factory Method?

### Answer

- More classes are required
- Slightly increases project complexity
- Can be unnecessary for very small projects
- More abstraction to understand

---

## 10. Where is Factory Method used in Java?

### Answer

Factory Method is widely used in Java frameworks.

Examples include:

- `Calendar.getInstance()`
- `NumberFormat.getInstance()`
- `ResourceBundle.getBundle()`

It is also used extensively in frameworks such as Spring and in logging libraries.

---

# Advanced Questions

## 11. Explain Factory Method using your Notification Service project.

### Answer

In our project:

- `Notification` is the Product interface.
- `EmailNotification`, `SMSNotification`, and `PushNotification` are Concrete Products.
- `NotificationFactory` is responsible for object creation.
- `OrderService` simply requests a Notification object and uses it.

This keeps object creation separate from business logic.

---

## 12. Can Factory Method return interfaces?

### Answer

Yes.

In fact, returning interfaces is considered best practice.

Example:

```java
Notification notification =
        NotificationFactory.createNotification(NotificationType.EMAIL);
```

Although the factory creates an `EmailNotification`, it returns the `Notification` interface.

This enables **Polymorphism** and reduces coupling.

---

## 13. Is Factory Method thread-safe?

### Answer

Factory Method itself is neither thread-safe nor non-thread-safe.

Thread safety depends on:

- The implementation of the factory
- Whether shared mutable state exists

If the factory only creates new objects and does not maintain shared state, it is naturally thread-safe.

---

## 14. Can Spring Boot BeanFactory be considered a Factory?

### Answer

Yes.

Spring's `BeanFactory` is one of the best real-world examples of the Factory concept.

Developers request beans from the container:

```java
ApplicationContext.getBean(UserService.class);
```

Spring decides:

- Whether to create the object
- Reuse an existing singleton
- Inject dependencies

The developer never uses `new` directly.

---

## 15. Explain Factory Method in JDBC.

### Answer

JDBC internally uses the Factory Method concept.

Example:

```java
Connection connection =
        DriverManager.getConnection(url, username, password);
```

The developer requests a `Connection`.

`DriverManager` determines the appropriate JDBC driver (MySQL, PostgreSQL, Oracle, etc.) and returns the correct implementation.

The client only works with the `Connection` interface without knowing the concrete class.

---

# Frequently Asked Interview Follow-ups

### Why shouldn't we use the `new` keyword everywhere?

Because direct object creation creates tight coupling between the client and concrete classes.

---

### Which Design Pattern usually comes after Factory Method?

**Abstract Factory**

Factory Method creates **one object**.

Abstract Factory creates **multiple related objects**.

---

### Can Factory Method create Singleton objects?

Yes.

The factory can return:

- Singleton objects
- Prototype objects
- Newly created objects

depending on the application's requirements.

---

### Is Factory Method only for object creation?

Yes.

Its primary responsibility is to **encapsulate object creation**, keeping creation logic separate from business logic.

---

# Summary

✔ Creates objects without exposing creation logic.

✔ Reduces coupling between client and concrete classes.

✔ Supports Open/Closed Principle.

✔ Commonly used in Spring Framework, JDBC, Java APIs, and enterprise applications.