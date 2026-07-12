# Abstract Factory Pattern

## Problem Statement

Suppose we are building a Cross Platform UI Framework.

The application should work on:

- Windows
- Mac
- Linux

Each operating system provides its own UI components.

For example:

Windows

- Button
- Checkbox
- TextField

Mac

- Button
- Checkbox
- TextField

Linux

- Button
- Checkbox
- TextField

The application should always use components from the same operating system.

If we accidentally mix components like:

- Windows Button
- Mac Checkbox
- Linux TextField

the UI becomes inconsistent.

The Abstract Factory Pattern ensures that related objects belonging to the same family are created together.


## Real-world Motivation

Imagine you are building a desktop application.

When the application starts, it detects the operating system.

If the user is on Windows:

- Windows Button
- Windows Checkbox
- Windows TextField

should be created.

If the user is on Mac:

- Mac Button
- Mac Checkbox
- Mac TextField

should be created.

The application should never worry about which concrete classes are being created.

It simply requests the appropriate factory.

The factory creates an entire family of related UI components.


## Advantages

- Creates families of related objects.
- Ensures consistency among products.
- Follows Open/Closed Principle.
- Promotes loose coupling.
- Easy to add new product families.

## When to Use

Use Abstract Factory when:

- Multiple related objects are created together.
- Product families should remain consistent.
- Client code should not depend on concrete classes.
- The application should support multiple platforms or themes.
