import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private JPanel mainPanel;

    public Main()  {
      this.setContentPane(mainPanel);
    }
    public static void main(String[]args) {
        Main f = new Main();
        f.setVisible(true);
        f.setSize(600,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout()); //ferestrei ii atribuim flowlayout
   // trebuie sa determinam cum il impartim: veritcal sau orizontal
        // fiecare panou trebuie sa aiba definita dimensiunea

        JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.gray);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.green);

        p1.setPreferredSize(new Dimension(200, 200));
        p2.setPreferredSize(new Dimension(200, 200));

        jsp.setLeftComponent(p1);
        jsp.setRightComponent(p2);
        // adaugam intregul split pane la intregul top level
        f.add(jsp);
    }
}
