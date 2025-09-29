package de.thokari.rps;

import java.util.Random;

public interface Player {

    Move nextMove();

    class AlwaysPaper implements Player {

        @Override
        public Move nextMove() {
            return Move.PAPER;
        }
    }

    class RandomMove implements Player {

        Random rng;

        public RandomMove(Integer rngSeed) {
            if (rngSeed == null) {
                rng = new Random();
            } else {
                rng = new Random(rngSeed);
            }
        }

        @Override
        public Move nextMove() {
            int r = rng.nextInt(Move.values().length);
            return Move.values()[r];
        }
    }
}
