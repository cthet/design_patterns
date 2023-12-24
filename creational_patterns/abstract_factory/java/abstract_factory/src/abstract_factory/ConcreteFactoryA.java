package abstract_factory;

public class ConcreteFactoryA implements AbstractFactory{
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
