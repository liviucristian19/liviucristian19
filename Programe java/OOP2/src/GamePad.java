public class GamePad extends Product {
 boolean wireless;

    public GamePad(String brand, String model, double price, boolean wireless) {
        super(brand, model, price);
        this.wireless= wireless;
    }

    @Override 
    public String toString() {  
      return super.toString() + " , " + "Wireless =" + wireless;

    }
}
