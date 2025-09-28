package de.thokari.rps;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    int compare(Move other) {
        if (this == other) return 0;
        if (this == ROCK) {
            if (other == SCISSORS) return 1;
            if (other == PAPER) return -1;
        }
        else if (this == PAPER) {
            if (other == ROCK) return 1;
            if (other == SCISSORS) return -1;
        }
        else if (this == SCISSORS) {
            if (other == PAPER) return 1;
            if (other == ROCK) return -1;
        }
        return 0;
    }
}
