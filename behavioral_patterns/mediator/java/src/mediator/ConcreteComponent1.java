package mediator;

public class ConcreteComponent1 extends Component {
    public ConcreteComponent1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteComponent1 received: " + message);
    }
}


