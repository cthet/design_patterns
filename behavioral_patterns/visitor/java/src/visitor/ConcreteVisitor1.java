package visitor;

public class ConcreteVisitor1 implements Visitor{
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor1 visiting ConcreteElementA");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor1 visiting ConcreteElementB");
    }
}
