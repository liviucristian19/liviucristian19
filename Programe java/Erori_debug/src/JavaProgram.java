import java.util.Scanner;
public class JavaProgram {
    public static void main(String[] args) {
        int numberA;
        int numberB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number A: ");
        numberA = scanner.nextInt();

        System.out.println("Please, enter number B: ");
        numberB = scanner.nextInt();
        if (numberA > numberB) {
            System.out.println("Number " + numberA + " is greater than " + numberB);
        } else if(numberB > numberA){
            System.out.println("Number " + numberB + " is greater than " + numberA);}
            else {
                System.out.println("Numbers are equal");

            }
        }
    }
