package de.thokari.rps;

import java.util.Map;

import static de.thokari.rps.Round.Result.*;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    Round.Result versus(Move other) {
        if (this == other) return DRAW;
        Map<Move, Move> beats = Map.of(
                ROCK, SCISSORS,
                PAPER, ROCK,
                SCISSORS, PAPER
        );
        if (other == beats.get(this)) {
            return P1_WINS;
        } else {
            return P2_WINS;
        }
    }
}
