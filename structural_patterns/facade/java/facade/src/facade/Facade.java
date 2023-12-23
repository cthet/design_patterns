package facade;

public class Facade {
    private SubsystemClassA subsystemA;
    private SubsystemClassB subsystemB;
    private SubsystemClassC subsystemC;

    public Facade() {
        subsystemA = new SubsystemClassA();
        subsystemB = new SubsystemClassB();
        subsystemC = new SubsystemClassC();
    }

    public void simplifiedOperation() {
        System.out.println("Facade coordinates subsystems:");
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}
