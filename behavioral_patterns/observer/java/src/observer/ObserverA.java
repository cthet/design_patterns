package observer;

public class ObserverA implements Observer{

    @Override
    public void update() {
        System.out.println("Observer A is notified.");
    }
}
