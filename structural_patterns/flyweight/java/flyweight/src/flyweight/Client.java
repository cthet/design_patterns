package flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fw1 = factory.getFlyweight("state1");
        Flyweight fw2 = factory.getFlyweight("state2");
        Flyweight fw3 = factory.getFlyweight("state1"); // This will reuse the existing 'state1' flyweight

        fw1.operation("extrinsic1");
        fw2.operation("extrinsic2");
        fw3.operation("extrinsic3");

        //Intrinsic State = state1, Extrinsic State = extrinsic1
        //Intrinsic State = state2, Extrinsic State = extrinsic2
        //Intrinsic State = state1, Extrinsic State = extrinsic3
    }
}
