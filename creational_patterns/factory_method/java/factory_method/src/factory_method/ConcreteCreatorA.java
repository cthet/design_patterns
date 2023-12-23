package factory_method;

public class ConcreteCreatorA extends Creator{
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
