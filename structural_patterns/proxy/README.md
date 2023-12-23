## Proxy

The Proxy design pattern is a structural pattern that provides an object acting as a substitute or placeholder for another object to control access to it. The primary objective is to control the interaction with the target object, which can be useful for various reasons like managing its lifecycle, adding additional behavior, or providing a simpler interface.

**How It Works:**

1. **Proxy Interface:** Both the proxy and the real object implement the same interface. This allows the proxy to be used anywhere the real object is expected.

2. **Real Object:** This is the actual object that the proxy represents. The real object contains the core business logic.

3. **Proxy Object:** The proxy object maintains a reference to the real object. When clients interact with the proxy, it delegates the requests to the real object and may perform additional actions such as:

    - **Access Control:** Restricting or controlling access to the real object.
    - **Lazy Initialization:** Creating or initializing the real object only when it's actually needed.
    - **Logging:** Keeping a record of the access or operations on the real object.
    - **Caching:** Storing results of expensive operations performed by the real object.

**Advantages:**

1. **Separation of Concerns:** It separates the core business logic from the cross-cutting concerns like logging, caching, or security.

2. **Enhanced Security:** The proxy can act as a protective layer that controls access to the real object, enhancing security.

3. **Lazy Initialization:** It can improve the performance and resource utilization by delaying the creation and initialization of expensive objects until they are actually needed.

4. **Transparency:** Clients interact with a proxy object in the same way they would with the real object. This transparency allows the Proxy pattern to be implemented without changing existing client code.

5. **Smart Reference:** The proxy can perform additional housekeeping tasks when an object is accessed, such as reference counting or thread-safety checks.

The Proxy pattern is widely used in various scenarios like virtual proxies (for lazy initialization), protection proxies (for access control), remote proxies (for accessing objects in different address spaces), and smart references (for additional housekeeping tasks on object access). This pattern provides a flexible and effective approach to adding functionality to an object without changing its interface.