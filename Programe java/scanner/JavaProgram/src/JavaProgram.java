import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");


        String username = scanner.nextLine();
        System.out.println("Hello" + " " + username);
    }
}
