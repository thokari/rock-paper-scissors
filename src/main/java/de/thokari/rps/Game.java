package de.thokari.rps;

import java.util.ArrayList;
import java.util.List;

public class Game {

    Player p1;
    Player p2;
    int numRounds;

    List<Round> rounds = new ArrayList<>();

    public Game(Player player1, Player player2, int numRounds) {
        this.p1 = player1;
        this.p2 = player2;
        this.numRounds = numRounds;
    }

    public List<Round> play() {
        for (int i = 0; i < numRounds; i++) {
            Move p1Move = p1.nextMove();
            Move p2Move = p2.nextMove();
            rounds.add(new Round(p1Move, p2Move).play());
        }
        return rounds;
    }
}
