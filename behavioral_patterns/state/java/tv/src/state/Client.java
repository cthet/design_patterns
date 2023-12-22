package state;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();

        System.out.println("First press:");
        tv.pressPowerButton(); // Turns the TV on

        System.out.println("Second press:");
        tv.pressPowerButton(); // Turns the TV off
    }
}