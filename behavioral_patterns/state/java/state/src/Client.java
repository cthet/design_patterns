public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // First request - transitions from State A to State B
        context.request();

        // Second request - transitions from State B to State C
        context.request();

        // Third request - remains in State C
        context.request();
    }
}