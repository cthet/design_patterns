package bridge;

abstract class RefinedAbstraction {
    protected AbstractionInterface implementor;

    public RefinedAbstraction(AbstractionInterface implementor) {
        this.implementor = implementor;
    }

    abstract String operation();
}
