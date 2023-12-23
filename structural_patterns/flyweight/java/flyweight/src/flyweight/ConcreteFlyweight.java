package flyweight;

public class ConcreteFlyweight implements Flyweight{
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operation(String extrinsicState) {
        System.out.println("Intrinsic State = " + intrinsicState + ", Extrinsic State = " + extrinsicState);
    }
}
