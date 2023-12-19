public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy(); // Execution of strategy A

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy(); // Execution of strategy B
    }
}