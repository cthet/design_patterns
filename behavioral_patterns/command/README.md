## Command

The Command design pattern is a behavioral design pattern that turns a request into a stand-alone object. This object contains all information about the request. This transformation allows command objects to be used in different frameworks and queues, making it easier to parameterize objects with operations, delay or queue a request’s execution, and support undoable operations.

### How It Works

1. **Command Interface:** This defines a standard interface for commands. Typically, it has an `execute()` method.

2. **Concrete Command:** Implements the Command interface and defines the binding between a Receiver object and an action. It invokes methods on the receiver to fulfill the request.

3. **Receiver:** Performs the actual work. It has the knowledge of what needs to be done to carry out the request.

4. **Invoker:** Asks the command to execute the request. It holds a command and at some point asks the command to do something.

5. **command.iterator.mediator.memento.observer.state.state.strategy.template_method.visitor.src.adapter.src.media_adapter.singleton.factory_method.Client:** Creates ConcreteCommand instances and sets their receiver. It might also configure the Invoker.

By decoupling the sender and receiver, the Command pattern allows for a high degree of flexibility in designing command structures, such as creating complex commands from simpler ones.