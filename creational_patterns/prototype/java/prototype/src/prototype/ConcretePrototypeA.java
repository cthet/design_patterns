package prototype;

public class ConcretePrototypeA implements Prototype{
    private String field;

    public ConcretePrototypeA(String field) {
        this.field = field;
    }

    // Copy Constructor
    public ConcretePrototypeA(ConcretePrototypeA prototype) {
        this.field = prototype.field;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA [field=" + field + "]";
    }
}
