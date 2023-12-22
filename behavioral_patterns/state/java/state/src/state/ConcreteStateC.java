package state;

public class ConcreteStateC extends AbstractState {
    @Override
    public void handle(Context context) {
        System.out.println("Handling state C. No further transitions.");
    }
}