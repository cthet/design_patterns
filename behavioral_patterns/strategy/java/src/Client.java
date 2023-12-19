public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy(); // Exécution de la stratégie A

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy(); // Exécution de la stratégie B
    }
}