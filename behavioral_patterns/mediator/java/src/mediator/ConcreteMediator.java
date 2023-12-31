package mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Component> components;

    public ConcreteMediator() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void send(String message, Component source) {
        for (Component component : components) {
            // Don't notify the source
            if (component != source) {
                component.receive(message);
            }
        }
    }
}