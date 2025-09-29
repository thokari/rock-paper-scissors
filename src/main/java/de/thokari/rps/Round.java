package de.thokari.rps;

public class Round {

    public enum Result {
        P1_WINS,
        P2_WINS,
        DRAW
    }

    Move p1Move;
    Move p2Move;
    Result result;

    public Round(Move p1Move, Move p2Move) {
        this.p1Move = p1Move;
        this.p2Move = p2Move;
    }

    public Round play() {
        this.result = p1Move.versus(p2Move);
        return this;
    }

    @Override
    public String toString() {
        return p1Move.toString() + " vs. " + p2Move.toString() + ": " + result.toString();
    }
}
