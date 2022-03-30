import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//tool tip == apare daca sageata mouse-ului ramane peste ceva un timp
public class Main extends JFrame{
    private JPanel mainPanel;
    private JButton myButton;
    private JButton button1;

    public Main() {
        this.setContentPane(mainPanel);

        myButton.setActionCommand("hello");
        button1.setActionCommand("goodbye");

        //mnemonic=scurtatura pe tastatura pentru activarea butonului
        //myButton.setMnemonic(KeyEvent.VK_A);

       /* myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // adaugam linie pentru afisarea casetei de mesaje
                JOptionPane.showMessageDialog(null,e.getActionCommand());
            }
        });*/
// nu ASA-cum e jos CI -->


        ActionListener myAl = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("hello"))
                    JOptionPane.showMessageDialog(null, "Hello!");
                if(e.getActionCommand().equals("goodbye"))
                    JOptionPane.showMessageDialog(null, "Goodbye!");
            }
        };
        myButton.addActionListener(myAl);
        button1.addActionListener(myAl);
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
