public class Wine extends Product {

    private final double bottleVolume;

    public Wine(String productName, String barCode, double basePrice, double tax, double bottleVolume) {
        super(productName, barCode, basePrice, tax);
        this.bottleVolume = bottleVolume;

    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "Volum Sticla(ml): " + this.bottleVolume;
    }

    public double PretcuTVAvin() {
        return PretcuTVAprodus() * 0.10 + basePrice;


    }
}
