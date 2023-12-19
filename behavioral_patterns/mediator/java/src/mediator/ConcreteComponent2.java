package mediator;

public class ConcreteComponent2 extends Component {
    public ConcreteComponent2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteComponent2 received: " + message);
    }
}