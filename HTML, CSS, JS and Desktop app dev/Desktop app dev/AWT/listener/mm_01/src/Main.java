import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Frame f = new Frame();
        f.setSize(600,400);  //container
        LayoutManager layOut = new FlowLayout();
        f.setVisible(true);

        //controlul label-ului
        Label l = new Label("Click me"); //pentru a afisa label-ul il adaugam in container
    f.add(l);

   l.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e) {
         l.setText("clicked");
       }
   });
        }
    }

