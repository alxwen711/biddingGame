import java.util.*;
import java.lang.Math.*;
public class AI {
    //class variables

    public int start; //amount of starting money
    public int p1_money, p2_money;
    public boolean tb; //if true, p1 has tb, else p2 has tb
    /**
     * Constructor
     */
    public AI(int start) {
        this.start = start;
        this.tb = true;
        this.p1_money = start;
        this.p2_money = start;
    }
    //methods

    /**
     * Configuration function for bid()
     * @param player which player the AI is playing as
     * @param pos current position of the bottle
     * @param p1_moves history of player 1's moves
     * @param p2_moves history of player 2's moves
     * @return int value of the bid determined
     */
    public int placeBid(int player, int pos, int[] p1_moves, int[] p2_moves) {
        if (player == 1) {
            return bid(pos, p1_money, p2_money, p1_moves, p2_moves, this.tb);
        }
        else { //playing player two, adjust accordingly
            return bid(10-pos, p2_money, p1_money, p2_moves, p1_moves, !this.tb);
        }
    }

    /**
     * Main bidding function
     * @param steps how many steps away from winning
     * @param pMoney player's money remaining
     * @param oMoney opp's money remaining
     * @param pMoves player's moves
     * @param oMoves opp's moves
     * @param tb does the player have tb advantage
     * @return int value of the bid determined
     */
    private int bid(int steps, int pMoney, int oMoney, int[] pMoves, int[] oMoves, boolean tb) {
        if (steps == 1) //trivial case where player is 1 step away
            return pMoney;
        if (steps == 9) //trivial case where opp is 1 step away
            return Math.min(oMoney,pMoney);
        if (pMoney == 0) //trivial case where no money is left
            return 0;
        return Math.max(pMoney/5,1); //no cases above solved, return 20% rounded down or 1
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

    /**
     * subtracts money from the player who won the bid
     * @param player player that won the bid
     * @param bid amount of money bid
     */
    private void subtractBid(int player, int bid) {
        if (player == 1) {this.p1_money -= bid;}
        else {this.p2_money -= bid;}
    }

    /**
     * function to determine who has the tiebreaker
     * @return 1 if player 1 has the tiebreaker, 2 otherwise
     */
    private int playerTB() {
        if (tb)
            return 1;
        else
            return 2;
    }

    /**
     * Swap tiebreaker to other player, occurs when both players have the same bid
     */
    private void swapTB() {
        if (this.tb) {tb = false;}
        else {tb = true;}
    }


}
