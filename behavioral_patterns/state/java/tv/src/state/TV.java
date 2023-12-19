public class TV {
    private State state;

    public TV() {
        // TV is initially off
        this.state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPowerButton() {
        state.pressPowerButton(this);
    }
}