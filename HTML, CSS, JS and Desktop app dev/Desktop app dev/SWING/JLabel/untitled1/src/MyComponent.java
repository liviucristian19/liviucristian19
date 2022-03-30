import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class MyComponent extends JComponent {
 public MyComponent(){
     this.setPreferredSize(new Dimension(200,60));

     //this.setToolTipText("THis is ToolTip text!");

     //setare cadru in jurul controalelor
     //1- setam line border
     //this.setBorder(BorderFactory.createLineBorder(Color.green,3));

     // 2-this.setBorder(BorderFactory.createBevelBorder(1));
 //3- cadru gravat-etched order
     //this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

     //4-cadru MAT
     //this.setBorder(BorderFactory.createMatteBorder(3,3,5,5,Color.green));
     //5-title border
     this.setBorder(BorderFactory.createTitledBorder("Border title"));
 }



    @Override
    protected void paintComponent(Graphics g) {
        System.out.println("paint");
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 200, 60);

        g.setColor(Color.darkGray);
        g.drawString("Hello   from   my   component", 10, 45);

    }
}
