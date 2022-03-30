import com.sun.jdi.InvocationException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

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

                JLabel progress = new JLabel();
                f.add(progress);

                long duration = 1000000L;

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        SwingWorker sw = new SwingWorker() {
                            @Override
                            protected Object doInBackground() throws Exception {
                                for (int i = 0; i < duration; i++)

                                    if (i % 1000 == 0) {
                                        int proc = (int) ((double) i / (double) duration * 100); // long in double si dupa in int -
                                         //sa pierdem valorile in procente

                                        publish("Completed " + proc + "%");

                                    }
                                return null;
                            }

                            @Override
                            protected void done() {
                                System.out.println("Work done!");
                            }

                            @Override
                            protected void process(List chunks) {

                                for (int i = 0; i < chunks.size(); i++) {
                                    System.out.println(chunks.get(i).toString());

/*                                    progress.setText(chunks.get(i).toString());
                                    progress.repaint();*/
                                }
                            }
                        };
                        sw.execute();  //linie ca sa rulez acest fir de executie
                        sw.cancel(true);
                    }

                });
            }
        };
        SwingUtilities.invokeAndWait(myGUI);
    }
}




