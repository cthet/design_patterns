package proxy;

class Proxy implements Subject {
    private RealSubject realSubject;

    public void request() {
        if (realSubject == null) {
            System.out.println("Proxy: Creating a new RealSubject.");
            realSubject = new RealSubject();
        }
        System.out.println("Proxy: Forwarding request to RealSubject.");
        realSubject.request();
    }
}
