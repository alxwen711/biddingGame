public class Player {

    public boolean human = true;

    //players game stats
    public boolean tb;
    public int coins;

    public Player(int coins) {
        this.tb = false;
        this.coins = coins;
    }

    public void settoAI() {
        this.human = false;
    }

    public void flipTB() { //flips tiebreaker
        if (this.tb)
            this.tb = false;
        else
            this.tb = true;
    }

}
