## State

The State design pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes. This pattern is particularly useful for implementing finite state machines in an object-oriented way.

### How It Works

1. **Context:** The class that has a state-dependent behavior. It maintains an instance of a ConcreteState subclass that reflects its current state.

2. **State (Abstract State):** An interface or abstract class defining the common interface for all concrete states. It declares methods which should be implemented by the concrete states to perform behavior specific to the state.

3. **Concrete States:** Classes that implement the State interface or extend the abstract State class. Each represents a different state of the context and contains state-specific behavior.


In the State pattern, the behavior of an object (referred to as the "context") is encapsulated in separate state objects. Each state object represents a specific state of the context and defines behavior associated with that state. The context object delegates its behavior to the current state object, which can change the context's state by transitioning to another state.


