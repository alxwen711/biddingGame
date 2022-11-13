import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;


public class GamePanel extends JPanel implements MouseListener,Runnable {

    //visuals
    private final Screen curScreen;

    //game element objects
    public Player p1;
    public Player p2;
    public Board b;

    //initial game stats
    public int startingCoins;
    public boolean startingTb; //true if player starts with TB
    public int gameResult;

    //buttons
    private buttonFactory bFactory;
    private JButton upOne;
    private JButton downOne;
    private JButton upTen;
    private JButton downTen;
    private JButton timesTwo;
    private JButton divTwo;

    //initialization methods

    /**
     * Create all the buttons to be drawn on screen
     */
    public void initButtons() {

    }
    /**
     * Runs the "game" screen
     * @param s Visual screen to draw on
     * @param coins number of starting coins
     * @param tb determines who starts with tb coin
     */
    public GamePanel(Screen s, int coins, boolean tb) { //init game
        this.curScreen = s;
        this.setLayout(null);
        p1 = new Player(coins);
        p2 = new Player(coins);
        b = new Board();
        this.startingCoins = coins;
        this.startingTb = tb;
        this.gameResult = 0;
        if (tb)
            p1.tb = true;
        else
            p2.tb = true;
        p2.settoAI(); //assume human vs AI games only for now, can adjust later

        //button initalization
        this.initButtons();
        this.bFactory = new buttonFactory();
        //create buttons
        int basew = 90;
        int baseh = 50;
        upOne = bFactory.createButton("+1",200,400,basew,baseh,this);
        downOne = bFactory.createButton("-1",300,400,basew,baseh,this);
        upTen = bFactory.createButton("+10",200,460,basew,baseh,this);
        downTen = bFactory.createButton("-10",300,460,basew,baseh,this);
        timesTwo = bFactory.createButton("x2",200,520,basew,baseh,this);
        divTwo = bFactory.createButton("x0.5",300,520,basew,baseh,this);

        //add buttons to screen
        this.add(upOne);
        this.add(downOne);
        this.add(upTen);
        this.add(downTen);
        this.add(timesTwo);
        this.add(divTwo);
    }

    //methods for controlling game logic
    @Override
    public void run() {
        while (this.gameResult == 0) {
            //general idea is as follows:
            /**
             * get p1's bid (player), check for validity
             * get p2's bid (AI)
             *  run ai
             * evaluate bids
             * winner gets 1 pos closer + remove currency
             * check if game is won by either side, if so break
             */
        }
        if (this.gameResult == 1) { //player 1 won
            return;
        }
        else { //player 2 won
            return;
        }
    }

    //add in method for drawing in coins here?
    //also add buttons as needed


    //methods for visual fill in
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(null,0,0,Screen.width,Screen.height,null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    //methods for game interaction
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
