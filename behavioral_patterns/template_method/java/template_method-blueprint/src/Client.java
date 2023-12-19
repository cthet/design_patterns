public class Client {
    public static void main(String[] args) {
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();

        System.out.println();

        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}