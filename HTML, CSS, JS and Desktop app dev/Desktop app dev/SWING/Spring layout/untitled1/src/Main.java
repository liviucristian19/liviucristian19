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
        f.setVisible(true);

        JButton b = new JButton("Button1");
        f.add(b);

        SpringLayout sl = new SpringLayout();
        f.setLayout(sl);

 // creem constrangeri
        sl.putConstraint(SpringLayout.WEST,b,100,SpringLayout.WEST,f);
        sl.putConstraint(SpringLayout.NORTH,b,100,SpringLayout.NORTH,f);


    }
}
