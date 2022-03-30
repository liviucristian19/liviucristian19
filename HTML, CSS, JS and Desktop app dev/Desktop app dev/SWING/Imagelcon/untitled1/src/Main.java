import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static java.awt.Label.LEFT;

public class Main extends JFrame {
    private JPanel mainPanel;

    public Main() {
        this.setContentPane(mainPanel);
    }

    public static void main(String[] args) {

        Main f = new Main();
        f.setVisible(true);
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50)); //ferestrei ii atribuim flowlayout

         ImageIcon ii = new ImageIcon("D:\\LINKAcademy\\JAVA\\untitled1\\src\\window.png");

        // f.setIconImage(ii.getImage());

       // JButton btn = new JButton(ii);
        JLabel lbl = new JLabel("Label text",ii,LEFT);
        f.add(lbl);


    }
}




