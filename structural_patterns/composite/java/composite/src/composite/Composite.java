package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> children = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println("Composite " + name + " is operated.");
        for (Component component : children) {
            component.operation();
        }
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int i) {
        return children.get(i);
    }
}
