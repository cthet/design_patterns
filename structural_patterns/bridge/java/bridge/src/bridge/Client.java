package bridge;

public class Client {
    public static void main(String[] args) {
        AbstractionInterface implementationA = new ConcreteImplementationA();
        RefinedAbstraction abstractionA = new ExtendedAbstractionA(implementationA);
        System.out.println(abstractionA.operation()); // ExtendedAbstractionA with Result of ConcreteImplementationA

        AbstractionInterface implementationB = new ConcreteImplementationB();
        RefinedAbstraction abstractionB = new ExtendedAbstractionB(implementationB);
        System.out.println(abstractionB.operation()); // ExtendedAbstractionB with Result of ConcreteImplementationB
    }
}
