public class Client {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.describe();//This is a modern chair.
        sofa.describe();//This is a modern sofa.
        coffeeTable.describe();//This is a modern coffee table.
    }
}
