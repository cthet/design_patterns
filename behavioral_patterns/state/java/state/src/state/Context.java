package state;

public class Context {
    private AbstractState state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}