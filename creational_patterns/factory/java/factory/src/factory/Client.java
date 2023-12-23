package factory;

public class Client {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();
        //ConcreteProductA operation.

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();
        //ConcreteProductB operation.
    }
}
