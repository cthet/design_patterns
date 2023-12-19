package observer;

public class ObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("Observer B is notified.");
    }
}