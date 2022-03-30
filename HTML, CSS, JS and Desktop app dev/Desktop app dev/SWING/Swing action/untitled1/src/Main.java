import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
    private JPanel mainPanel;
    static Integer elapsed = 0;

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
// instantiez un obiect al actiunii
        Action a = new AbstractAction("Button") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Action performed!");
            }
        };
        //creez 2 controale button si putem adauga actiunea de mai SUS la aman2

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        f.add(button1);
        f.add(button2);
        //adaug actiunile in aceste controale
        button1.setAction(a);
        button2.setAction(a);

    }
}




