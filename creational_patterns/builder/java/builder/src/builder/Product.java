package builder;

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) { this.partA = partA; }
    public void setPartB(String partB) { this.partB = partB; }
    public void setPartC(String partC) { this.partC = partC; }

    public String getDescription() {
        return "Product with: " + partA + ", " + partB + ", " + partC;
    }
}
