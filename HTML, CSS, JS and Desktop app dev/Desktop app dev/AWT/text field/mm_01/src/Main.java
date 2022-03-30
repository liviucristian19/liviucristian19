import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(600, 400);  //container
        f.setLayout(new FlowLayout());

        TextField tf = new TextField();
        TextArea ta = new TextArea( 5, 25);

        f.add(tf);
        f.add(ta);

        tf.setText("text Field:");
        ta.setText("text area:");

        f.setVisible(true);
    }
}

