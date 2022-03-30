import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JPanel mainPanel;
    private Totalizer totalizer1;

    public Main() {
        this.setContentPane(mainPanel);

    }

    public static void main(String[] args) {
        Main f = new Main();
        f.setVisible(true);
        f.setSize(600, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout()); //ferestrei ii atribuim flowlayout
    }

    private void createUIComponents() {
        totalizer1 = new Totalizer();
        totalizer1.setBackground(Color.ORANGE);
    }
}



