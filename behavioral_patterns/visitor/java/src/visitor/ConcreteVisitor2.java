package visitor;

public class ConcreteVisitor2 implements Visitor{
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor2 visiting ConcreteElementA");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor2 visiting ConcreteElementB");
    }
}
