package bridge;

public class ExtendedAbstractionA extends RefinedAbstraction{
    public ExtendedAbstractionA(AbstractionInterface implementor) {
        super(implementor);
    }

    public String operation() {
        return "ExtendedAbstractionA with " + implementor.operationImpl();
    }
}
