import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private JPanel mainPanel;

    public Main()  {
      this.setContentPane(mainPanel);
    }
    public static void main(String[]args) {
        Main f = new Main();
        f.setVisible(true);
        f.setSize(600,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout()); //ferestrei ii atribuim flowlayout

        JTextArea ta = new JTextArea(10,10);
        ta.setLineWrap(true);

       //f.add(ta);
        // vrem sa avel scrool pe lateral  JSCROLL PANE
        JScrollPane sp = new JScrollPane(ta);
        f.add(sp);

        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //putem face acelasi lucru si pentru linia verticala
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    }
}
