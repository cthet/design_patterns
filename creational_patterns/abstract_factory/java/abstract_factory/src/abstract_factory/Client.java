package abstract_factory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factoryA = new ConcreteFactoryA();
        AbstractProductA productA = factoryA.createProductA();
        productA.useProductA();
        //Using Product A1

        AbstractFactory factoryB = new ConcreteFactoryB();
        AbstractProductB productB = factoryB.createProductB();
        productB.useProductB();
        //Using Product B2
    }
}
