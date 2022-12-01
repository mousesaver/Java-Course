public class Dogg extends Animal {

    private String earShape;
    private String tailShape;

    public Dogg() {
        super("Mutt", "Big", 50);
    }

    public Dogg(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dogg(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dogg{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
