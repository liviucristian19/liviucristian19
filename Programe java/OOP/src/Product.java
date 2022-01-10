public class Product {
    protected String productName;
    protected String barCode;
    protected double basePrice;
    protected static double tax;

public String getProductName(){return productName;}
   public void setProductName(String productName){this.productName = productName;}

 public String getBarCode(){return barCode;};
   public void setBarCode(String barCode){this.barCode = barCode;}

  public double getBasePrice(){return basePrice;}
   public void setBasePrice(double basePrice){this.basePrice = basePrice;}

  public double getTax(){return tax;}
  private void setTax(double tax){this.tax = tax;}

public Product(String productName, String barCode, double basePrice, double tax){
    this.productName = productName;
    this.barCode = barCode;
    this.basePrice = basePrice;
    this.tax = tax;
}

    public String getInfo() {
        return "Produsul: " + this.productName + "\n" +
                "Cod de bare: " + this.barCode + "\n" +
                "Pret de baza: " + this.basePrice  + "\n" +
                "Taxa(%): " + this.tax ;
    }

    public double PretcuTVAprodus() {
        return basePrice * 0.2 + basePrice;
    }
}

