import com.sun.jdi.InvocationException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Main extends JFrame {
    private JPanel mainPanel;

    public Main() {
        this.setContentPane(mainPanel);
    }

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {

        Runnable myGUI = new Runnable() {
            @Override
            public void run() {
                Main f = new Main();
                f.setVisible(true);
                f.setSize(500, 300);
                f.setLocationRelativeTo(null);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50)); //ferestrei ii atribuim flowlayout

                JButton button = new JButton("Start");
                f.add(button);

                //adaugam un text field
                JTextField textField = new JTextField(50);
                f.add(textField);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        SwingWorker sw = new SwingWorker() {
                            @Override
                            protected Object doInBackground() throws Exception {
                                for (int i = 0; i < 100000; i++)
                                    System.out.println(i);
                                return null;
                            }

                            @Override
                            protected void done() {
                                System.out.println("Work done!");
                            }
                        };
                        sw.execute();  //linie ca sa rulez acest fir de executie
                    }

                });
            }
        };
        SwingUtilities.invokeAndWait(myGUI);
    }
}




