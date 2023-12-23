package decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        Decorator decoratorB = new ConcreteDecoratorB(decoratorA);

        decoratorB.operation();

        //ConcreteComponent operation.
        //ConcreteDecoratorA added behavior.
        //ConcreteDecoratorB added behavior.
    }
}
