import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JPanel mainPanel;
    private JRadioButton male;
    private JRadioButton female;

    public Main() {
        this.setContentPane(mainPanel);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(e.getActionCommand().equals("male")) {
                  JOptionPane.showMessageDialog(null, "You are male");
              }
              else if(e.getActionCommand().equals("female")){
                  JOptionPane.showMessageDialog(null,"You are female");
              }
            }
        };

        male.addActionListener(al);
        female.addActionListener(al);
      }
    public static void main(String[]args) {
        Main f = new Main();
        f.setSize(600,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout()); //ferestrei ii atribuim flowlayout
        f.setVisible(true);

    }
}
