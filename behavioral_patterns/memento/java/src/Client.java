import memento.CareTaker;
import memento.Originator;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        System.out.println("Current State: " + originator.getState()); // Current State: State #3

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState()); // First saved State: State #1
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState()); // Second saved State: State #2
    }
}
