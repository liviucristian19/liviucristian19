import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Main extends JFrame {
    private JPanel mainPanel;
    private JList list;
    private JList list2;
    private JList list1;


    public Main() {
        this.setContentPane(mainPanel);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                JList list = (JList) e.getSource(); //ajungem la controlul care a indicat evenimentul
                int [] is = list.getSelectedIndices(); //determinam indexul

                for(Integer i :is){
                    System.out.println(list.getModel().getElementAt(i)); //parcurgem toate indexurile selectate
                }
            }
        });
    }
        public static void main (String[]args){
            Main f = new Main();
            f.setVisible(true);
            f.setSize(600, 300);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(new FlowLayout()); //ferestrei ii atribuim flowlayout
        }
    }



