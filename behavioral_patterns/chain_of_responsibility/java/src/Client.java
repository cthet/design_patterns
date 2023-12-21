import chain_of_responsibility.AbstractHandler;
import chain_of_responsibility.ConcreteHandler1;
import chain_of_responsibility.ConcreteHandler2;
import chain_of_responsibility.Request;

public class Client {
    public static void main(String[] args) {
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler2();

        handler1.setNextHandler(handler2);


        Request request1 = new Request("Type1");
        handler1.handleRequest(request1); // ConcreteHandler1 handled the request.

        Request request2 = new Request("Type2");
        handler1.handleRequest(request2); // ConcreteHandler2 handled the request.

        Request request3 = new Request("Type3"); // End of chain reached. Request not handled.
        handler1.handleRequest(request3);
    }
}