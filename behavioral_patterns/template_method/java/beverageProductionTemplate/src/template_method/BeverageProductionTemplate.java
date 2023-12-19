package template_method;

public abstract class BeverageProductionTemplate {
    boolean customerWantsCondiments = false;

    public final void prepareBeverage() {
        boilWater();
        mixIngredients();
        pourInCup();
        if (customerWantsCondiments) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void mixIngredients();
    abstract void addCondiments();


    public void setCustomerWantsCondiments(boolean customerWantsCondiments) {
        this.customerWantsCondiments = customerWantsCondiments;
    }
}