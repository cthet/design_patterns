package beverage_production;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nChoose your beverage:\n" +
                "1 - Coffe\n" +
                "2 - Tea");
        int beverageChoice = Integer.parseInt(reader.readLine());

        System.out.println("\nDo you want condiments?:\n" +
                "1 - Yes\n" +
                "2 - No");
        int condimentChoice = Integer.parseInt(reader.readLine());

        BeverageProductionTemplate beverage = null;
        if (beverageChoice == 1) {
            beverage = new Coffee();
        } else if (beverageChoice == 2) {
            beverage = new Tea();
        }
        
        if (condimentChoice == 1) {
            beverage.setCustomerWantsCondiments(true);
        }

        beverage.prepareBeverage();
    }
}
