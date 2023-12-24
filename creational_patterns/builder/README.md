## Builder

The Builder design pattern is a creational pattern used for constructing complex objects step by step. It separates the construction of a complex object from its representation, which allows the same construction process to create different representations. This pattern is particularly useful when an object needs to be created with many optional components or configurations.

**How It Works:**

1. **Builder Interface:** This defines the methods for constructing the various parts of the product.

2. **Concrete Builder:** Implements the Builder interface and provides concrete implementation for the construction methods. It keeps track of the product being constructed and offers a method to retrieve the finished product.

3. **Product:** The complex object that is being built. It's often composed of multiple parts.

4. **Director:** Responsible for controlling the construction process. It calls the builder methods to assemble the product. This is optional and not always necessary, especially in cases where the creation process is straightforward.

**Advantages:**

1. **Separation of Concerns:** It separates the construction of a complex object from its representation, making it easier to control the construction process.

2. **Encapsulation:** The Builder pattern encapsulates the way a complex object is constructed.

3. **Flexibility:** Provides flexibility in the type of object to be created by the concrete builder. Different builders can create different representations of the product.

4. **Readability:** Improves code readability, especially when creating an object with many optional parameters.

5. **Immutability:** The product is typically built step by step, and it can be made immutable if no setter methods are defined.

6. **Fluent Interface:** Often, the Builder pattern is implemented with a fluent interface, allowing for a more readable and user-friendly way to configure the product being built.

The Builder pattern is widely used in scenarios where a class requires numerous optional and mandatory parameters, making it a suitable choice for constructing complex objects.