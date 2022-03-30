import javax.swing.*;

public class Main extends JFrame{
    private JPanel mainPanel;

    public Main()  {
      this.setContentPane(mainPanel);
    }
    public static void main(String[]args) {
        Main f = new Main();

        f.setSize(600,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(new BoxLayout(f.mainPanel, BoxLayout.PAGE_AXIS));

         JButton b1 = new JButton("Button1");
         JButton b2 = new JButton("Button2");

         f.add(b1);
         f.add(b2);

        f.setVisible(true);
    }
}
