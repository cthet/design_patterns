public abstract class AbstractClass {

    public final void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }

    protected void stepOne() {
        System.out.println("Step 1: Implemented in the Abstract class");
    }

    protected abstract void stepTwo();
    protected abstract void stepThree();
}