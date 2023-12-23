## Strategy

The Strategy design pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It involves defining a family of algorithms, encapsulating each one, and making them interchangeable.


### How It Works

1. **Strategy Interface**: This defines a common interface for all supported algorithms. Each algorithm encapsulated by the Strategy pattern implements this interface.

2. **Concrete Strategies**: These are classes that implement the Strategy interface, providing specific implementations of the algorithm.

3. **Context**: This class maintains a reference to a Strategy object. It may define an interface that lets Strategy access its data. The Context does not know the concrete class of a Strategy. It should work with all Strategies via the Strategy interface.

4. **command.iterator.mediator.memento.observer.state.state.strategy.template_method.visitor.src.adapter.src.media_adapter.singleton.factory.Client**: The client chooses a Concrete Strategy and passes it to the Context. The Context calls the algorithm defined by the chosen Strategy.

The main advantage of the Strategy pattern is that it promotes a set of algorithms to be defined and encapsulated within their own class. This not only makes a set of algorithms easier to manage and use but also promotes more flexible and reusable code, as the Context can switch strategies based on the situation at runtime.