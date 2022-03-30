import java.awt.*;
public class Main extends Frame {
    //suprascriem metoda paint
    static int endCup;
    @Override
    public void paint(Graphics g) { //metoda paint
   Graphics2D g2 = (Graphics2D) g;

        g.drawArc(100, 100, 100, 100, 0, endCup);
    }
    public static void main(String[] args) throws InterruptedException {
        Main f = new Main();
        f.setSize(300,300);
        f.setVisible(true);

        for (int i = 0; i <360 ; i++) {
            endCup=i;
            f.repaint();
            //setam o intarziere pentru a vedea rezultatul
            Thread.sleep(20);
        }
    }
}

