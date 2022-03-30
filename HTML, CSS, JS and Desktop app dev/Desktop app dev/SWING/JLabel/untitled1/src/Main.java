import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//tool tip == apare daca sageata mouse-ului ramane peste ceva un timp
public class Main extends JFrame{
    private JPanel mainPanel;
    private JLabel myLabel;

    private JLabel testLabel2;

    public Main()  {
      this.setContentPane(mainPanel);

      testLabel2 = new JLabel("new test label");
      //testLabel2.setFont(new Font("Arial", Font.PLAIN,36));
      //testLabel2 = new JLabel("<html>Hello<br/>from<br/>my<br/>label!</html>");
      //this.add(testLabel2);
         myLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
   JLabel label = (JLabel) e.getComponent(); //controlul label-ului
                // adaugam o linie pentru schimbarea controlului text
label.setText("Clicked");
            }
        });
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
