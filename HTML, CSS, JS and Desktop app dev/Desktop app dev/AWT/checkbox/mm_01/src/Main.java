import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args)  {
        Frame f = new Frame();
        f.setSize(600,400);  //container
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        Checkbox cb = new Checkbox("chech box 1");
        f.add(cb);

        cb.setPreferredSize(new Dimension(100,20));

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cb.getState()){
                    cb.setLabel("checked");
                } else {
                    cb.setLabel("Un-checked");
                }
            }
        });

        }
    }

