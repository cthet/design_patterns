import iterator.ConcreteAggregate;
import iterator.Iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<String>();
        aggregate.add("Item 1");
        aggregate.add("Item 2");
        aggregate.add("Item 3");

        Iterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //Item 1
            //Item 2
            //Item 3
        }
    }
}
