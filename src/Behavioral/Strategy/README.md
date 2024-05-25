### Strategy Pattern
The `Strategy Design Pattern` is one of the `behavioral design patterns`.
It allows you to define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. This pattern lets the algorithm vary independently from the clients that use it.

#### Intent:
Define a family of algorithms, encapsulate each one, and make them interchangeable.
Let the algorithm vary independently from the clients that use it.
Structure

The Strategy pattern involves three main components:

- #### Strategy Interface:
    An interface common to all supported algorithms. Context uses this interface to call the algorithm defined by a Concrete Strategy.

- #### Concrete Strategies:
    Classes that implement the Strategy interface.

- #### Context:
    Maintains a reference to a Strategy object and uses this reference to call the algorithm defined by a Concrete Strategy.
    UML Diagram

```text

+-------------------+      +-------------------------+
|    IStrategy      |<-----|      Context            |
|-------------------|      |-------------------------|
|+ algorithm():void |      |- strategy: IStrategy    |
+-------------------+      |+ setStrategy(IStrategy) |
                           |+ executeStrategy():void |
                           +-------------------------+
                                ^
                                |
        +-----------------------+-----------------------+
        |                                               |
    +-------------------+                         +-------------------+
    | ConcreteStrategyA |                         | ConcreteStrategyB |
    |-------------------|                         |-------------------|
    |+ algorithm():void |                         |+ algorithm():void |
    +-------------------+                         +-------------------+

```