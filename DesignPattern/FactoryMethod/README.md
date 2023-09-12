# Factory Method

## Definition of Factory Method:

Define an interface for creating an object, but let subclasses decide
which class to instantiate. Factory Method lets a class defer instantiation to the subclasses.

## The reason to use factories:

This pattern encapsulate object creation
and lead to more decoupled, flexible designs.

## The Problem that forced us to use factories:

Let's consider a pizza store where we offer a variety of pizza types, including cheese, Greek, clam, and veggie. We also have a method called orderPizza(). Based on the customer's order, we create an object representing the specific type of pizza that the customer has requested.

Till now no problem.

If we introduce new types of pizza into the system, we may need to modify the orderPizza() method. This situation raises concerns related to the Open-Closed Principle (OCP), as it violates the principle by requiring us to make changes to the existing code.

A solution to this problem is to implement a factory method that contains different types of pizza and can create objects based on the selected pizza type. This method will return the corresponding pizza object.

So factory method encapsulate object creation
and lead to more decoupled, flexible designs.

### The code with the problem is located in the orderPizza() method, where there is an issue with handling new pizza types or delete old pizza type.

![Alt text](image-1.png)

### "The code after solving this problem will:

![Alt text](image-2.png)

## Some notes about this pattern:

-- All factories encapsulate object creation.<br>
-- Simple Factory, while not a bona fide design pattern, is a simple way to decouple your clients from concrete classes.<br>
-- Factory Method relies on inheritance: object creation is
delegated to subclasses which implement the factory method to
create objects.<br>
-- All factory patterns promote loose coupling by reducing the
dependency of your application on concrete classes.<br>
-- The intent of Factory Method is to allow a class to defer
instantiation to its subclasses.<br>
-- The Dependency Inversion Principle guides us to avoid
dependencies on concrete types and to strive for abstractions.<br>
-- Factories are a powerful technique for coding to
abstractions, not concrete classes.<br>

## some principles about these Factories:

Factories rely on abstraction and should not rely on concrete classes.

## We have Three types of factories:

### 1)Simple factory

### 2)Method factory

### 3)Abstract factory

## let us talk about difference between simple factory and method factory:

![Alt text](image-5.png)

So, the difference between them is that a simple factory is a concrete class (a class that has factory method), whereas a method factory implements an abstract class (creator).

## Let's take an example(Pizza Store) of the simple factory:

### UML Diagram:

![Alt text](image-3.png)

### Details About PizzaStore:

-- We have a class named PizzaStore that instantiates an object of PizzaSimpleFactory. Within this class, there's a method called createOrder(String type). In this method, we create a new object based on the type of pizza the customer has ordered. We then return this object to pizzaOrder() and proceed to call the prepare, bake, cut, and box methods.<br>
-- We have a PizzaSimpleFactory class that contains all types of pizza, allowing us to modify the class by adding or deleting different kinds of pizza as needed.<br>
-- we have abstract class pizza that has methods prepare, bake, cut and box.<br>
-- We have various pizza types that extend the Pizza class and override all of its methods in their respective classes.

## Let's take an example(Pizza Store) of the factory method:

### UML Diagram:

![Alt text](image-6.png)

### Details About Pizza store using the factory method:

-- We have an abstract class named PizzaStore that has two methods: orderPizza() (concrete) and createPizza() (an abstract method that is overridden in classes that extend from PizzaStore). Within this class, there's a method called createOrder(String type). In this method, we create a new object based on the type of pizza the customer has ordered. We then return this object to pizza Object pizzaOrder() and proceed to call the prepare, bake, cut, and box methods.<br>
-- We offer two styles: New York style and Chicago style, which extend from the PizzaStore class and override the createMethod() function.<br>
-- Each style has different various pizza types (cheese, pepperoni, clam and veggie).<br>
-- we have abstract class pizza that has methods prepare, bake, cut and box.<br>
-- We have various pizza types that extend the Pizza class and override all of its methods in their respective classes.

## I will provide an explanation of the abstract factory pattern in a separate directory

## How to avoid OO Designs that violate the Dependency Inversion Principle?

![Alt text](image-4.png)
