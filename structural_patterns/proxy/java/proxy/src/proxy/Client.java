package proxy;

public class Client {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();

        //Proxy: Creating a new RealSubject.
        //Proxy: Forwarding request to RealSubject.
        //RealSubject: Handling request.
    }
}
