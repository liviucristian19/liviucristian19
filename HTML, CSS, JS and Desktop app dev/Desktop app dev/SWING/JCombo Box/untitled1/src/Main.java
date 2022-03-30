import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main extends JFrame {
    private JPanel mainPanel;
    private JComboBox comboBox1;


    public Main() {
        this.setContentPane(mainPanel);

/*        comboBox1.addItem("London");
        comboBox1.addItem("Paris");*/
        //instantiez obiecte de tip city si le adaug la control box

        comboBox1.addItem(new City("London", 1));
        comboBox1.addItem(new City("Paris", 2));


        comboBox1.setRenderer(new DefaultListCellRenderer() { //creem obiect anonim

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (value instanceof City) {   //daca componenta e de tip city-setam valoarea de tip main
                    setText(((City) value).getName());
                }
                return this;
            }
        });


  /*      comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                City city = (City) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(null,city.getName());
            }
        });*/
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {    //nu va functiona complet

                //creem bloc conditional
                if(e.getStateChange() != ItemEvent.SELECTED)
                    return;

//                JComboBox comboBox = (JComboBox) e.getSource();
                City city = (City) e.getItem();
                JOptionPane.showMessageDialog(null,city.getName());

            }
        });
    }


    public static void main(String[] args) {
        Main f = new Main();
        f.setVisible(true);
        f.setSize(600, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout()); //ferestrei ii atribuim flowlayout


    }
}

// creem o clasa sa putem obiecte in Combo Box
class City {
    String name;
    int id;

    public City(String name, int id) {
        this.name = name;
        this.id = id;
    }
// putem face altfel in loc de toString ; cream o metoda get

    public String getName() {
        return name;
    }


/*    @Override
    public String toString() {
        return name;
    }*/
}


