package facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.simplifiedOperation();

        //Facade coordinates subsystems:
        //SubsystemClassA operation.
        //SubsystemClassB operation.
        //SubsystemClassC operation.
    }
}
