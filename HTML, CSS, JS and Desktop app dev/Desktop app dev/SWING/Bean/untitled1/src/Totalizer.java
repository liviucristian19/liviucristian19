import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Totalizer extends JComponent {

    private Color background;

    JTextField a;
    JTextField b;
    JTextField c;
    JButton add;
    JLabel addSign;
    JLabel equalSign;
//vream sa definim cum va arata-definim paint component

    //definim get si set pentru color-background


    @Override
    public Color getBackground() {
        return background;
    }

    @Override
    public void setBackground(Color background) {
        this.background = background;
        //adaugam metoda repaint

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        //g.setColor(Color.gray);  // modificam ca backgorund
        g.setColor(background);


        //desenam un derptunghi
        g.fillRect(0, 0, 200, 100);
    }

    public Totalizer() {
        this.setLayout(new FlowLayout());

        a = new JTextField(2);
        b = new JTextField(2);
        c = new JTextField(2);

        add = new JButton("Add");
        addSign = new JLabel("+");
        addSign.setForeground(Color.white);

        equalSign = new JLabel("=");
        equalSign.setForeground(Color.white);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer res = Integer.parseInt(a.getText()) + Integer.parseInt(b.getText()); //logica de adunare
                c.setText(res.toString());
            }
        });
        this.add(a);
        this.add(addSign);
        this.add(b);
        this.add(equalSign);
        this.add(c);
        this.add(add);

        this.background=Color.blue ;
    }
}
