package composite;

public class Client {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");
        Component leaf3 = new Leaf("Leaf 3");
        Composite composite = new Composite("Composite");

        composite.add(leaf1);
        composite.add(leaf2);
        composite.add(leaf3);

        composite.remove(leaf2);

        composite.operation();

        //Composite Composite is operated.
        //Leaf Leaf 1 is operated.
        //Leaf Leaf 3 is operated.
    }
}
