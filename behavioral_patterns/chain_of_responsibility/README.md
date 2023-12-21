## Chain of responsibility

The Chain of Responsibility is a behavioral design pattern that allows passing a request along a chain of handlers. Instead of having a single object handling all types of requests, each handler in the chain can process the request or pass it to the next handler in the chain.

### How It Works

1. **Chain of Handlers:** Multiple handlers are linked together in a chain. Each handler in the chain gets a chance to process the request passed to it.

2. **Processing or Forwarding:** When a handler receives a request, it has two choices:
   - Process the request if it is capable of doing so.
   - Pass the request to the next handler in the chain.

3. **End of the Chain:** If no handler in the chain processes the request, it can either be ignored or handled in a default way at the end of the chain.

### Advantages

- **Decoupling:** The request senders are decoupled from the receivers. The senders do not need to know which object in the chain will handle the request.
- **Flexibility:** It's easy to add new handlers or change the order of existing handlers without changing the core logic.
- **Responsibility Segregation:** Each handler has its own specific responsibility, promoting clarity and ease of maintenance.


The Chain of Responsibility pattern is particularly useful in situations where multiple objects can handle a request, but the appropriate handler is not known in advance and must be determined dynamically.