import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
 initComponents();
    }

    void initComponents(){
    this.setVisible(true);
    this.setSize(600,400);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null); //se centreaza fereastra

    JButton b = new JButton("Button");
    this.add(b);

    this.setLayout(new FlowLayout()); // obtinem buton cu dimensiune implicita
}
    public static void main(String[] args)  {
       // JFrame f = new JFrame("First Swing App");
        Main f = new Main();
        f.setVisible(true);
    }
}

