public abstract class AbstractClass {
    // La méthode template
    public final void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }

    protected void stepOne() {
        System.out.println("Étape 1: Implémentée dans la classe de base");
    }

    // Ces méthodes doivent être implémentées dans les sous-classes
    protected abstract void stepTwo();
    protected abstract void stepThree();
}