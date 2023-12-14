package beverageProductionTemplate;

public class Coffee extends BeverageProductionTemplate {

    @Override
    void mixIngredients() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}