import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//currently a copy of MainPanel, adjust as needed
public class HelpPanel extends JPanel implements MouseListener {
    private final Screen curScreen;
    private final JButton back;
    private final buttonFactory bFactory;

    public HelpPanel(Screen s){
        this.curScreen = s;
        this.bFactory = new buttonFactory();
        this.setLayout(null); //background

        //create buttons
        this.back = bFactory.createButton("back",50,50,120,60,this);

        //add buttons to screen
        this.add(back);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(null,0,0,Screen.width,Screen.height,null);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == back) //go back to main menu screen
            curScreen.changePanel(new MainPanel(curScreen));

        /*
        e.getSource() = upArrow,downArrow,start, handle each case as needed
        curScreen.changePanel(new _Panel(curScreen));
         */
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

