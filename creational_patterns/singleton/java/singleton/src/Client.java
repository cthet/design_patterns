public class Client {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();

        singletonInstance.someBusinessLogic();
    }
}
