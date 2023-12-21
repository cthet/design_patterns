import observer.ConcreteObservable;
import observer.ObserverA;
import observer.ObserverB;

public class Client {
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();

        observable.subscribe(observerA);
        observable.subscribe(observerB);

        observable.setState("state changed");
        //Observer A is notified.
        //Observer B is notified.

        observable.unsubscribe(observerA);

        observable.setState("another state changed");
        //Observer B is notified.
    }
}