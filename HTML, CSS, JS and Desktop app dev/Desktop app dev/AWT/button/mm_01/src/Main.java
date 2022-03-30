import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args)  {
        Frame f = new Frame();
        f.setSize(600,400);  //container
        f.setLayout(new FlowLayout());
        f.setVisible(true);

    // instantiem un button
 Button b = new Button("Click me");  // putem crea event listeners pentru click cu mouse-ul pe buton
 b.setPreferredSize(new Dimension(110, 20));
f.add(b);

// il modificam
   b.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e) {
         b.setLabel("clicked");
         b.setBackground(Color.magenta);
       }
   });
        }
    }

