import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Main extends JFrame {
    private JPanel mainPanel;

    public Main() {

        this.setContentPane(mainPanel);
    }

    public static void main(String[] args) {

        Main f = new Main();
        f.setSize(500, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50)); //ferestrei ii atribuim flowlayout

        SpinnerListModel slm = new SpinnerListModel(new String[]{"Apple", "Orange", "Peach", "Grape"});

        JSpinner js = new JSpinner(slm);

        f.add(js);

        f.setVisible(true);
    }
}


