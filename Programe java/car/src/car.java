public class car {
    public static void main(String[] args) {
        String carMake = "Bemveu";
        int doors = 222;
        // outer switch
        switch (carMake) {

            case "Bemveu":

                // inner switch
                switch (doors) {
                    case 2 -> System.out.println("Ai masina sport. Esti baro$an.\n Numero unu !");
                    case 3 -> System.out.println("WTF-iao!\n Cate usi are?");
                    case 4 -> System.out.println("Ai un numar 'normal' de usi;\nEsti cineva, omu' paiangan!");
                    default -> System.out.println("Nu s-a facut anul asta! N-ai bemveu, n-ai valoare!\n Mai taie din ele, da daaaa!");

                }


        }
    }
}
