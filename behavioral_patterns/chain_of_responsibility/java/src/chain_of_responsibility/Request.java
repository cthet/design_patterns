package chain_of_responsibility;

public class Request {
    private String type;

    public Request(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
