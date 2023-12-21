## Template method

The Template Method design pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method of a superclass, but lets subclasses override specific steps of the algorithm without changing its structure.

### How It Works

1. **Abstract Class**: This class contains the template method which defines the skeleton of an algorithm. It consists of a series of method calls that define the algorithm's structure. Some of these methods might be implemented in the abstract class itself, while others are abstract and must be implemented in subclasses.

2. **Concrete Classes**: These classes extend the abstract class and implement the abstract methods defined in it. Each concrete class provides its own implementation for these steps, thus altering parts of the algorithm without changing its structure.

3. **Template Method**: This is a method in the abstract class, which calls the series of methods that make up the components of the algorithm. Some of these methods are common to all subclasses (and can be defined in the abstract class), while others are specific to each subclass.

The Template Method pattern is used to create a method stub and defer some of the steps of implementation to subclasses. It lets one redefine certain steps of an algorithm without changing the algorithm's structure. It is particularly useful for algorithms with a fixed set of steps, where some steps have invariant parts while others are variable.