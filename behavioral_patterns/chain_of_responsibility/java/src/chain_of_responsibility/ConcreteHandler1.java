package chain_of_responsibility;


public class ConcreteHandler1 extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        if (canHandleRequest(request)) {
            System.out.println("ConcreteHandler1 handled the request.");
        } else {
            super.handleRequest(request);
        }
    }

    private boolean canHandleRequest(Request request) {
        return "Type1".equals(request.getType());
    }
}
