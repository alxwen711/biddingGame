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

public class MainPanel extends JPanel implements MouseListener {

    //non button parameters
    private final Screen curScreen;
    private final buttonFactory bFactory;
    public int coinAmount;
    public boolean tb;

    //buttons
    private final JButton start;
    private final JButton help;
    private final JButton upOne;
    private final JButton downOne;
    private final JButton upTen;
    private final JButton downTen;
    private final JButton tieBreak;

    public MainPanel(Screen s){
        this.curScreen = s;
        this.bFactory = new buttonFactory();
        this.setLayout(null); //background
        this.coinAmount = 100;
        this.tb = true;
        //create buttons
        start = bFactory.createButton("start",250,400,100,100,this);
        help = bFactory.createButton("help",450,400,100,100,this);
        upOne = bFactory.createButton("+1",700,400,90,40,this);
        downOne = bFactory.createButton("-1",700,440,90,40,this);
        upTen = bFactory.createButton("+10",800,400,90,40,this);
        downTen = bFactory.createButton("-10",800,440,90,40,this);
        tieBreak = bFactory.createButton("tiebreaker",950,420,180,40,this);
        //add buttons to screen
        this.add(start);
        this.add(help);
        this.add(upOne);
        this.add(downOne);
        this.add(upTen);
        this.add(downTen);
        this.add(tieBreak);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(null,0,0,Screen.width,Screen.height,null);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawString(String.format("%d",coinAmount),600,450);
        if (this.tb)
            g.drawString("tiebreak = true",600,300);
        else
            g.drawString("tiebreak = false",600,300);
    }

    @Override
    public void mouseClicked(MouseEvent e) { //refactor to case statement
        Object event = e.getSource();
        if (event == upOne) //increase coin count by 1
            this.coinAmount += 1;
        else if (event == downOne)  //decrease coin count by 1
            this.coinAmount -= 1;
        else if (event == upTen)  //inc by 10
            this.coinAmount += 10;
        else if (event == downTen)  //dec by 10
            this.coinAmount -= 10;
        else if (event == help) //help screen
            curScreen.changePanel(new HelpPanel(curScreen));
        else if (event == start) //begin game
            curScreen.changePanel(new GamePanel(curScreen));
        else if (event == tieBreak) { //tiebreak coin swap
            if (tb)
                this.tb = false;
            else
                this.tb = true;
        }
        if (this.coinAmount < 5)
            this.coinAmount = 5; //min needed to "win"
        this.repaint();
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

