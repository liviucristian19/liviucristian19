import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private JPanel mainPanel;

    public Main() {
        this.setContentPane(mainPanel);

      }
    public static void main(String[]args) {
        Main f = new Main();
        f.setVisible(true);
        f.setSize(600,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout()); //ferestrei ii atribuim flowlayout

        JFileChooser fc = new JFileChooser();
        int response = fc.showSaveDialog(null);

        switch (response){
            case JFileChooser.CANCEL_OPTION:
                break;
            default:
                JOptionPane.showMessageDialog(null,fc.getSelectedFile().getPath());
        }
        }
        }


