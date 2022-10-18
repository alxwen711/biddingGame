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
    private final JButton start;
    private final JButton help;
    private final JButton upArrow;
    private final JButton downArrow;
    public HelpPanel(Screen s){
        this.curScreen = s;
        this.setLayout(null);

        //start button
        start = new JButton("start");
        start.setBounds(250,400,100,100);
        start.addMouseListener(this);
        this.add(start);

        //help button
        help = new JButton("help");
        help.setBounds(450,400,100,100);
        help.addMouseListener(this);
        this.add(help);

        //arrow buttons
        upArrow = new JButton("+1");
        downArrow = new JButton("-1");
        upArrow.setBounds(700,400,150,40);
        downArrow.setBounds(700,440,150,40);
        upArrow.addMouseListener(this);
        downArrow.addMouseListener(this);
        this.add(upArrow);
        this.add(downArrow);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(null,0,0,Screen.width,Screen.height,null);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("test",Screen.width/10,Screen.height/10);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == upArrow) //change to increase coin count by 1
            curScreen.changePanel(new MainPanel(curScreen));
        else if (event == downArrow) //change to decrease coin count by 1
            curScreen.changePanel(new MainPanel(curScreen));
        else if (event == help)
            curScreen.changePanel(new HelpPanel(curScreen));

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

