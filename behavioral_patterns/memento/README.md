## Memento

The Memento design pattern is a behavioral design pattern that allows an object to save its internal state and restore it later without revealing the details of its implementation. This pattern is especially useful in applications where you need to provide an undo mechanism or maintain a history of an object's states.

**How It Works:**

1. **Memento:** This class holds the internal state of an object to be saved. It stores the necessary state attributes required to restore the object to its previous state.

2. **Originator:** This is the main object whose state needs to be saved and restored. It creates a memento containing a snapshot of its current internal state and can also use the memento to restore its internal state.

3. **Caretaker:** This class is responsible for the lifecycle of the memento. It keeps track of the mementos but never modifies or examines the contents of a memento. The Caretaker decides when the Originator needs to save or restore its state.

**Advantages:**

1. **Encapsulation:** Memento preserves encapsulation by keeping the internal state of the Originator object inside the Memento. Only the Originator can access or modify this state.

2. **Undo Functionality:** It provides a straightforward way to implement undo or rollback functionality. By storing previous states in mementos, a system can easily return to a prior state.

3. **History Management:** It allows you to keep a history of an object's states without exposing the details of those states, enabling you to rollback to any previous state stored in the mementos.

4. **Simplifies Originator:** By externalizing the state saving and restoring process, the Originator’s implementation becomes less complex and easier to maintain.

In summary, the Memento pattern is valuable for managing snapshots of an object's state, especially for features like undo mechanisms and state history tracking, while maintaining the integrity and encapsulation of the object's internal structure.