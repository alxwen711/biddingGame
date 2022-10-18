import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.MouseListener;

public class buttonFactory {

    public buttonFactory() {

    }

    public JButton createButton(String name, int x, int y, int w, int h, MouseListener p) {
        JButton b = new JButton(name);
        b.setBounds(x,y,w,h);
        b.addMouseListener(p);
        return b;
    }
}
