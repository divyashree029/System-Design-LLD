Basic
1. What is Abstract Factory?

Answer

Abstract Factory is a creational design pattern that provides an interface for creating families of related objects without specifying their concrete classes.

2. Why do we use Abstract Factory?

To create multiple related objects while ensuring they belong to the same family.

3. Factory Method vs Abstract Factory?
   Factory Method	Abstract Factory
   Creates one object	Creates a family of objects
   One factory method	Multiple factory methods
   Simpler	More flexible
4. Real-world example?

Windows UI, Mac UI, Linux UI.

5. Which SOLID principle?

Open/Closed Principle and Dependency Inversion Principle.

Intermediate
6. Advantages?
   Loose coupling
   Product consistency
   Easy platform switching
7. Disadvantages?

More classes and slightly higher complexity.

8. Can it return interfaces?

Yes.

In fact, it should.

Example

Button button = factory.createButton();
9. Is Spring using Abstract Factory?

Yes.

BeanFactory and ApplicationContext are good examples.

10. Java Examples
    Swing LookAndFeel
    JavaFX
    JDBC Drivers
    Spring BeanFactory