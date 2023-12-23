package decorator;

public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addedBehaviorB();
    }

    private void addedBehaviorB() {
        System.out.println("ConcreteDecoratorB added behavior.");
    }
}
