import mediator.ConcreteComponent1;
import mediator.ConcreteComponent2;
import mediator.ConcreteMediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteComponent1 component1 = new ConcreteComponent1(mediator);
        ConcreteComponent2 component2 = new ConcreteComponent2(mediator);

        mediator.addComponent(component1);
        mediator.addComponent(component2);

        component1.send("Message from Component1");
        component2.send("Message from Component2");
    }
}