public class OnState extends State {
    @Override
    public void pressPowerButton(TV context) {
        System.out.println("TV is turning off.");
        context.setState(new OffState());
    }
}
