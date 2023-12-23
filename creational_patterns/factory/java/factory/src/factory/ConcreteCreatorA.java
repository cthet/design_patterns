package factory;

public class ConcreteCreatorA extends Creator{
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
