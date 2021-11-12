/**
 * Exerciţiu
 * Trebuie creat un program Java care va calcula volumul cilindrului,
 * a cărui rază este 10, iar înălțimea 50.
 * r = 10
 * H = 50
 * V = r2 * Pi * H
 * Pi – constanta Pi, 3.14
 * Valoarea obținută trebuie scrisă la ieșire.
 *
 * Notă: Taskul trebuie trimis ca un proiect IntelliJ IDEA complet și arhivat (rar, zip).
 * @author Liviu Nae
 */

public class VolumCilindru {
    public static void main(String[]args)
    {
        double r=10;
        double H=50;
        float V;
        V = (float) (Math.PI *(r*r)*H);
        System.out.printf("Volumul cilindrului este: %.9f" ,V);
    }
}
