import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.Font;

public class buttonFactory {

    /**
     * Creates an object to streamline button creation.
     */
    public buttonFactory() {

    }

    /**
     * creates a new JButton object with the specified parameters.
     * @param name button's name
     * @param x horizontal position
     * @param y vertical position
     * @param w button width
     * @param h button height
     * @param p button interactivity object, passed from a Panel object
     * @return JButton object
     */
    public JButton createButton(String name, int x, int y, int w, int h, MouseListener p) {
        JButton b = new JButton(name);
        b.setFont(new Font("Arial", Font.PLAIN, 20));
        b.setBounds(x,y,w,h);
        b.addMouseListener(p);
        return b;
    }
}
