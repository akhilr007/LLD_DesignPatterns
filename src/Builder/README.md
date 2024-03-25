### Builder Design Pattern

- It is a creational design pattern.
- It is used when the construction process of different product is same.

##### Working of Builder Design Pattern

 - `Director`: This is the main component that orchestrates the construction process. It works with a builder object to construct the final object.


 - `Builder`: The Builder interface defines the steps required to construct the object. It usually includes methods for setting different attributes or parts of the object.


 -  `Concrete Builders`: These are concrete implementations of the Builder interface. Each concrete builder provides its own implementation for constructing the object. This allows you to create different variations of the object by using different concrete builders.


 - `Product`: This is the complex object being constructed. The final product can vary based on the builder used and the configuration set during the construction process.