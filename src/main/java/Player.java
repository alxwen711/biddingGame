public class Player {

    public boolean human = true;

    //players game stats
    public boolean tb;
    public int coins;

    public Player(int coins) {
        this.tb = false;
        this.coins = coins;
    }

    /**
     * Set the player object to be controlled by an AI
     */
    public void settoAI() {
        this.human = false;
    }

    /**
     * Method for controlling the tiebreaker logic
     */
    public void flipTB() { //flips tiebreaker
        if (this.tb)
            this.tb = false;
        else
            this.tb = true;
    }
}
