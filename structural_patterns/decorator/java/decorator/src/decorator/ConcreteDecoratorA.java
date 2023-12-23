package decorator;

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addedBehaviorA();
    }

    private void addedBehaviorA() {
        System.out.println("ConcreteDecoratorA added behavior.");
    }
}
