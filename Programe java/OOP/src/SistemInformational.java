
public class SistemInformational {
    public static void main(String[] args){

        Product product = new Product("Whiskas","1231231312",200,20);
        System.out.println(product.getInfo());
        System.out.println("Pretul final al produsului(TVA inclus) este de: " + product.PretcuTVAprodus() + "\n");

Chocolate chocolate = new Chocolate("Milka","1212312312",100,20,50);
        System.out.println(chocolate.getInfo());
        System.out.println("Pretul final al ciocolatei(TVA inclus) este de: " + chocolate.PretcuTVAprodus() + "\n");

Wine wine = new Wine("Murfatlar", "13453453453", 300,32, 750);
        System.out.println(wine.getInfo());
        System.out.println("Pretul final al vinului(TVA inclus) este de: " + wine.PretcuTVAvin() + "\n");
    }


}
