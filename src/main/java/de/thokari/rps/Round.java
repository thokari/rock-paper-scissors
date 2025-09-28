package de.thokari.rps;

public class Round {

    Move p1Move;
    Move p2Move;
    int result;

    public Round(Move p1Move, Move p2Move) {
        this.p1Move = p1Move;
        this.p2Move = p2Move;

        result = getResult();
    }

    public int getResult() {
        return p1Move.compare(p2Move);
    }

    @Override
    public String toString(){
        String outcome = "Draw";
        if (result == -1) {
            outcome = "Player 2 wins";
        }
        if (result == 1) {
            outcome = "Player 1 wins";
        }
        return p1Move.toString() + " vs. " + p2Move.toString() + ", Result: " + outcome;
    }
}
