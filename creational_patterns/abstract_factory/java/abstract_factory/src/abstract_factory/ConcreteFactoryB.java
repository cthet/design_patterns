package abstract_factory;

public class ConcreteFactoryB implements AbstractFactory{
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
