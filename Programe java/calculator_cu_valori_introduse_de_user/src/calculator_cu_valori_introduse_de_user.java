import java.util.Scanner;

public class calculator_cu_valori_introduse_de_user {
    public static void main(String args[]){
        char operatie;
        double numar1, numar2 , rezultat;
        Scanner input= new Scanner(System.in);  // creem obiectul clasei Scanner
        System.out.println("Introdu unul dintre operatorii: +, -, * sau /");
        operatie=input.next().charAt(0);
        System.out.println("Care este primul numar?");
        numar1=input.nextDouble();
        System.out.println("Care este cel de-al doilea numar?");
        numar2=input.nextDouble();

  switch (operatie){
      case '+':
          rezultat= numar1 + numar2;
          System.out.println(numar1 + " + " + numar2  + " = " + rezultat);
          break;

      case '-':
          rezultat= numar1 - numar2;
                    if (rezultat<0)
              System.out.println("Mai taie din ele");
                    else System.out.println(numar1 + "-" + numar2 + " = " + rezultat);
          break;
      case '*':
          rezultat=numar1 * numar2;
          System.out.println(numar1 + " * " + numar2 + " = " + rezultat);
          break;
      case '/':
          rezultat= numar1 / numar2;
          System.out.println(numar1 + " / "+ numar2 + " = " + rezultat);
          break;
      default:
          System.out.println("Ai gresit operatia, baiatul meu!");
          break;
  }
input.close();
    }
}
