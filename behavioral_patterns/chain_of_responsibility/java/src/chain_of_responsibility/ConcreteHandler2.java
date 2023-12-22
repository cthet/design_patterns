package src;

public class ConcreteHandler2 extends AbstractHandler {
    @Override
    public void handleRequest(Request request) {
        if (canHandleRequest(request)) {
            System.out.println("ConcreteHandler2 handled the request.");
        } else {
            super.handleRequest(request);
        }
    }

    private boolean canHandleRequest(Request request) {
        return "Type2".equals(request.getType());
    }
}
