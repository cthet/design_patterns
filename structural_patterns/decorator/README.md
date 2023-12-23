## Decorator

The Decorator design pattern is a structural pattern used for dynamically adding behavior and responsibilities to individual objects, without modifying the objects' classes or affecting other instances of the same class. It offers a more flexible approach to extending functionality compared to subclassing.

**How It Works:**

1. **Component Interface:** This defines the interface for objects that can have responsibilities added to them.

2. **Concrete Component:** A class implementing the Component interface, representing objects to which new responsibilities can be attached.

3. **Decorator Class:** An abstract class that implements the Component interface and has a reference to a Component object. This class acts as the base for all decorators that can add additional behaviors to the component.

4. **Concrete Decorators:** These are classes that extend the Decorator class. Each one adds its specific behavior or state to the component. They override the Component methods, usually calling the parent method and adding their own behavior.

**Advantages:**

1. **More Flexibility than Inheritance:** Unlike inheritance, which statically defines an object's behavior, the Decorator pattern allows for adding behavior dynamically. It provides a flexible alternative to subclassing for extending functionality.

2. **Avoids Class Explosion:** If you have multiple independent extensions, using subclassing can lead to a large number of subclasses. The Decorator pattern allows these functionalities to be combined dynamically, avoiding an explosion of subclasses.

3. **Single Responsibility Principle:** It allows a class to focus on its primary responsibility and delegates the additional functionalities to decorators, adhering to the Single Responsibility Principle.

4. **Open/Closed Principle:** The pattern adheres to the Open/Closed Principle, as you can introduce new decorators without changing existing code.

Overall, the Decorator pattern is ideal for situations where you need to grant additional responsibilities to objects at runtime without altering the objects' structure or affecting other instances of the same class. It provides a flexible and scalable solution for extending object behavior.