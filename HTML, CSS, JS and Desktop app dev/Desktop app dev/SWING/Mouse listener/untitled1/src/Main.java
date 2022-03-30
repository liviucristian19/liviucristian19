import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
                
        //determinare coordonate sageti mouse
        JLabel mousePosition = new JLabel();
        f.add(mousePosition);

        f.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { //1
                System.out.println("clicked on");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) { //2
                System.out.println("enter");
            }

            @Override
            public void mouseExited(MouseEvent e) { //3
                System.out.println("exit");
            }
        });
    }
}




