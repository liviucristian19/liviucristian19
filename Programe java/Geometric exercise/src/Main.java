public class Main {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.x = 100;
        c.y = 200;
        c.color = "red";
        c.r = 12;
        System.out.println(c.area() + " " +c.color);     // 452.16
    }
}