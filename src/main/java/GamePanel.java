import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GamePanel extends JPanel implements MouseListener {

    //visuals
    private final Screen s;

    //game element objects
    public Player p1;
    public Player p2;
    public Board b;
    //initial game stats
    public int startingCoins;
    public boolean tb; //true if player starts with TB


    public GamePanel(Screen s) { //init game
        p1 = new Player();
        p2 = new Player();
        b = new Board();
        this.s = s;
    }


    //add in method for drawing in coins here?
    //also add buttons as needed

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(null,0,0,Screen.width,Screen.height,null);
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
