import visitor.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new ConcreteElementA());
        elements.add(new ConcreteElementB());

        Visitor visitor1 = new ConcreteVisitor1();
        Visitor visitor2 = new ConcreteVisitor2();

        for (Element element : elements) {
            element.accept(visitor1);
            element.accept(visitor2);
        }
        // ConcreteElementA:
        // ConcreteVisitor1 visiting ConcreteElementA
        // ConcreteVisitor2 visiting ConcreteElementA

        // ConcreteElementB:
        // ConcreteVisitor1 visiting ConcreteElementB
        // ConcreteVisitor2 visiting ConcreteElementB
    }
}
