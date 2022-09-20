import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Screen extends JFrame {

    private int width = 1200;
    private int height = 675;
    public Screen(){
        this.setSize(width,height); //16:9 screen ratio
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //adjustable later
        this.setTitle("Hackerrank Bidding Game Emulator");
    }
}
