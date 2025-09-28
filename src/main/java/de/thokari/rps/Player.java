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
            int r = rng.nextInt(3);
            return switch (r) {
                case 0 -> Move.ROCK;
                case 1 -> Move.PAPER;
                default -> Move.SCISSORS;
            };
        }
    }
}
