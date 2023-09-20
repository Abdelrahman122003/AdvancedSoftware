# Command Design Pattern

## Definition:

The Command Pattern encapsulates a request as an object, there by letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.<br>

Command pattern --> invoker + sender + receiver + client.

## when to use?

Encapsulating a request in an object.<br>
Decouple sender from processor or receiver.<br>
Undo operation.<br>
When we have too much functionality within a class.<br>

## The UML diagram for the Command Pattern is shown below:

![Alt text](image.png)

## How does the Command pattern work during runtime?

![Alt text](image-1.png)

## Some notes about this pattern:

-- The Command Pattern decouples an object, making a request from the one that knows how to perform it.<br>
-- A Command object is at the center of this decoupling and
encapsulates a receiver with an action (or set of actions).<br>
-- An invoker makes a request of a Command object by calling
its execute() method, which invokes those actions on the receiver.<br>
-- Invokers can be parameterized with Commands, even
dynamically at runtime.<br>
-- Commands may support undo by implementing an undo method that restores the object to its previous state before the execute() method was last called.<br>
-- Macro Commands are a simple extension of Command that allow multiple commands to be invoked. Likewise, Macro Commands can easily support undo().<br>
-- In practice, it is not uncommon for “smart” Command objects to implement the request themselves rather than delegating to a receiver.<br>
-- Commands may also be used to implement logging and
transactional systems.<br>

## Let's take an example(remote Control) of the Command design pattern:

### The UML Diagram For this example:

![Alt text](image-2.png)

### Let's look at another UML diagram(UML diagram with additional details):

![Alt text](image-3.png)

### Details About the Remote Control:

-- In this example I will define everything like which Invoker, client(Sender), Command and receiver.<br>
Client(sender) ==> loadRemote class(Main)<br>
Invoker ==> RemoteControl class.<br>
Receiver ==> CeilingFan and Light classes.<br>
Commands ==> All different Command classes:<br>
CeilingFanHighCommand, CeilingFanMediumCommand, CeilingFanLowCommand,CeilingFanOffCommand, LightOnCommand, LightOffCommand, NoCommand and
MacroCommand.<br>
-- So, the Command interface has two methods: execute() and undo().<br>
-- And all command classes that have implemented all methods in the Command interface.<br>
-- And we have a CeilingFan (Receiver) class that includes details for the fan's settings: high, medium, and low, as well as the off state.<br>
-- The Light class is similar to the CeilingFan class.<br>
-- So, we can conclude that receivers --> devices.<br>
-- In every Command class, we will create an object based on the command type (**CeilingFan**LowCommand or **Light**OffCommand).<br>
-- For more details, in the execute method, we will call a state that specifies this Command for example in LightOffCommand class in execute method in this class we will call off state.<br>
-- up Until now, I have been discussing the execute method. Now, let's talk about the undo() method. In the execute method, we will store the current state, and we will call it in the undo method.<br>
-- And we have RemoteControlWithUndo class that has some methods including
setCommand(), onButtonWasPress(), offButtonWasPress() and undoButtonWasPress().<br>
-- We will execute based on the type of button pressed.<br>
