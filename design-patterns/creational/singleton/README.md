# Singleton Design Pattern

## Definition

The Singleton Pattern ensures that a class has only one instance throughout the application while providing a global point of access to that instance.

---

## Problem Statement

Consider an application where multiple services require access to application configuration.

If every service creates its own ConfigurationManager object:

- Memory is wasted.
- Configuration is loaded multiple times.
- Different objects may hold inconsistent state.

---

## Real World Motivation

Imagine:

- Configuration Manager
- Logger
- Cache Manager
- Printer Queue
- Runtime Environment

Only one object should exist throughout the application.

---

## Mini Project

Configuration Manager

Services:

- User Service
- Order Service
- Payment Service

All services share the same ConfigurationManager object.

---

## Naive Implementation

Every service creates

new ConfigurationManager()

Problems:

- Multiple objects
- Higher memory consumption
- Duplicate configuration loading

---

## Solution

Use Singleton.

Make constructor private.

Create one static object.

Provide public getInstance() method.

---

## Advantages

- Saves memory
- Global access
- Consistent application state
- Easy to use

---

## Disadvantages

- Global state
- Difficult to unit test
- Tight coupling
- Thread safety needs attention

---

## When to Use

- Logger
- Configuration Manager
- Cache Manager
- Printer Queue
- Runtime
- File System Manager

---

## When NOT to Use

- Student
- Employee
- Product
- Shopping Cart
- Order
- Customer

---

## Project Structure

Singleton

├── UML

├── Interview Notes

├── Exercises

└── Java Implementation

---
