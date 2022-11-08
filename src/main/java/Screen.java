import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Screen extends JFrame {

    public static int width = 1200;
    public static int height = 675;
    public Screen(){
        this.setSize(width,height); //16:9 screen ratio
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //adjustable later
        this.setTitle("Hackerrank Bidding Game Emulator");
        changePanel(new MainPanel(this));
    }


    /**
     * Changes the current screen to a new one usually on press of a JButton
     * @param panel new "panel" to change current screen to
     */
    public void changePanel(JPanel panel){
        panel.setPreferredSize(new Dimension(Screen.width, Screen.height));
        this.getContentPane().removeAll();
        this.add(panel);
        this.pack();
        this.setVisible(true);
        panel.setFocusable(true);
        panel.requestFocus();
    }
}
