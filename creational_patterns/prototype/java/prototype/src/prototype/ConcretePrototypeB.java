package prototype;

public class ConcretePrototypeB implements Prototype{
    private String field;

    public ConcretePrototypeB(String field) {
        this.field = field;
    }

    // Copy Constructor
    public ConcretePrototypeB(ConcretePrototypeB prototype) {
        this.field = prototype.field;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeB(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB [field=" + field + "]";
    }
}
