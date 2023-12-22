package state;


public class ConcreteStateA extends AbstractState {
    @Override
    public void handle(Context context) {
        System.out.println("Handling state A. Transitioning to state B.");
        context.setState(new ConcreteStateB());
    }
}