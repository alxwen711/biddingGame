import java.util.*;

public class AI {
    //class variables

    public int start;
    public boolean tb; //if true, p1 has tb, else p2 has tb
    /**
     * Constructor
     */
    public AI(int start) {
        this.start = start;
        this.tb = true;
    }
    //methods

    /**
     * Starting bid function
     */
    public int bid(int player, int pos, int[] p1_moves, int[] p2_moves) {
        return 5;
    }

    /**
     * Determine how much money each player has left, as well as tb position.
     * @param p1_moves list containing player 1's moves
     * @param p2_moves p1_moves but with player 2
     * @return int[2] containing remaining money for player 1 and 2
     */
    public int[] moneyLeft(int[] p1_moves, int[] p2_moves) {
        int[] ans = new int[2];
        ans[0] = this.start;
        ans[1] = this.start;
        this.tb = true;
        return ans;
    }


}
