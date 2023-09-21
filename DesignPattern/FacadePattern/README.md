# Facade Design Pattern

## Definition:

The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher level interface that makes the subsystem easier to use.<br>

## when to use?

-- Giving simple interface for complex system/subsystem.<br>
-- Good in isolation(Changes does not affect client).<br>
-- We can have more than one facade for a single system.<br>

## The UML diagram for the Command Pattern is shown below:

![Alt text](image.png)

## Some notes about this pattern:

-- When you need to simplify and unify a large interface or complex set of interfaces, use a facade.<br>
-- A facade decouples a client from a complex subsystem.<br>
-- Implementing a facade requires that we compose the facade with its subsystem and use delegation to perform the work of the facade.<br>
-- A facade wraps a set of objects to simplify.<br>

## some principles about this pattern:

-- Principle of Least Knowledge ==> Only talk to your friends(That statement means that the client communicates with the facade, which acts as a friend for the client).

### Please take a look at this image to understand what I mean:

![Alt text](image-1.png)

### The principle tells us that we should only invoke methods that belong to:

1. The object itself
2. Objects passed in as a parameter to the method
3. Any object the method creates or instantiates
4. Any components of the object

### Let's use an example to clarify these points (1-4) about this principle:

![Alt text](LeastKnowledge.png)
