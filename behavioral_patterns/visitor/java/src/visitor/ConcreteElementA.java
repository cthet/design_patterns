package visitor;

public class ConcreteElementA implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
