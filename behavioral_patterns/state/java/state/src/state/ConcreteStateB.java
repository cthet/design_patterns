package state;


public class ConcreteStateB extends AbstractState {
    @Override
    public void handle(Context context) {
        System.out.println("Handling state B. Transitioning to state C.");
        context.setState(new ConcreteStateC());
    }
}
