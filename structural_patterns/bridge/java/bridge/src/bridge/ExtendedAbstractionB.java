package bridge;

public class ExtendedAbstractionB extends RefinedAbstraction{
    public ExtendedAbstractionB(AbstractionInterface implementor) {
        super(implementor);
    }

    public String operation() {
        return "ExtendedAbstractionB with " + implementor.operationImpl();
    }
}
