## Adapter

The Adapter design pattern, also known as the Wrapper pattern, is a structural design pattern that allows objects with incompatible interfaces to collaborate. It acts as a bridge between two different interfaces, making them compatible without changing their existing code.

**How It Works:**

1. **Target Interface:** This is the expected interface that the clients want to use.

2. **LegacyService:** The class that has the existing functionality but an incompatible interface with the target.

3. **Adapter:** This class implements the target interface and includes a reference to an LegacyService object. It translates calls from the target interface into a format that the LegacyService understands.

**Process:**

- The client interacts with the target interface.
- The adapter receives this interaction and translates it into an appropriate call to the LegacyService's methods.
- The LegacyService executes the request and returns the result.
- The adapter may convert the result to a format suitable for the client and returns it.

**Advantages:**

1. **Reusability and Flexibility:** Enables reuse of existing code or third-party code that otherwise would not be compatible with the existing system.

2. **Loose Coupling:** The client is decoupled from the details of the LegacyService, promoting loose coupling between systems.

3. **Single Responsibility Principle:** The adapter handles the conversion of interfaces, allowing the target and LegacyService to focus on their primary responsibilities.

4. **Ease of Integration:** Facilitates integration with legacy code or third-party libraries, making it easier to extend the system with new features.

In summary, the Adapter pattern is beneficial when you need to integrate components with mismatched interfaces. It is especially useful in systems where changing existing code is impractical due to constraints like backward compatibility or involvement of third-party components.