import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        //variabila pentru stocarea secundelor care s-au scurs


        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//linie pentru schimbarea titlului ferestrei
                f.setTitle("Time elapsed: " + (elapsed++).toString());
            }
        });
        //rulez timerul cu metoda start
        t.start();
    }
}




