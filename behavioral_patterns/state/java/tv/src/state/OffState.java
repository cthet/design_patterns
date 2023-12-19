public class OffState extends State {
    @Override
    public void pressPowerButton(TV context) {
        System.out.println("TV is turning on.");
        context.setState(new OnState());
    }
}