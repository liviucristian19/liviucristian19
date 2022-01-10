public class Chocolate extends Product {

    private final double weight;

    public Chocolate(String productName, String barCode, double basePrice, double tax, double weight) {
        super(productName, barCode, basePrice, tax);
        this.weight = weight;

        }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "Greutate(g): " + this.weight;
    }
}

