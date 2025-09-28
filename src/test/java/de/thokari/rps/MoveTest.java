package de.thokari.rps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveTest {

    @Test
    public void paperBeatsRockBeatsScissorsBeatsPaper() {
        // Expect: PAPER beats ROCK
        Assertions.assertEquals(1, Move.PAPER.compare(Move.ROCK));
        // Expect: ROCK beaten by PAPER
        Assertions.assertEquals(-1, Move.ROCK.compare(Move.PAPER));

        // Expect: ROCK beats SCISSORS
        Assertions.assertEquals(1, Move.ROCK.compare(Move.SCISSORS));
        // Expect: SCISSORS beaten by ROCK
        Assertions.assertEquals(-1, Move.SCISSORS.compare(Move.ROCK));

        // Expect: SCISSORS beats PAPER
        Assertions.assertEquals(1, Move.SCISSORS.compare(Move.PAPER));
        // Expect: PAPER beaten by SCISSORS
        Assertions.assertEquals(-1, Move.PAPER.compare(Move.SCISSORS));
    }
}
