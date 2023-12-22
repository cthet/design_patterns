import command.*;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command commandA = new ConcreteCommandA(receiver);
        Command commandB = new ConcreteCommandB(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(commandA);
        invoker.executeCommand(); // Action A is performed.

        invoker.setCommand(commandB);
        invoker.executeCommand(); // Action B is performed.
    }
}
