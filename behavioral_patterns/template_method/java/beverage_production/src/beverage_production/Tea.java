package beverage_production;

public class Tea extends BeverageProductionTemplate {

    @Override
    void mixIngredients() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
