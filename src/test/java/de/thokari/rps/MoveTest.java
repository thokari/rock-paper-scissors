package de.thokari.rps;

import org.junit.jupiter.api.Test;
import static de.thokari.rps.Move.*;
import static de.thokari.rps.Round.Result.P1_WINS;
import static de.thokari.rps.Round.Result.P2_WINS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveTest {

    @Test
    public void paperBeatsRockBeatsScissorsBeatsPaper() {
        assertEquals(P1_WINS, PAPER.versus(ROCK));
        assertEquals(P2_WINS, ROCK.versus(PAPER));
        assertEquals(P1_WINS, ROCK.versus(SCISSORS));
        assertEquals(P2_WINS, SCISSORS.versus(ROCK));
        assertEquals(P1_WINS, SCISSORS.versus(PAPER));
        assertEquals(P2_WINS, PAPER.versus(SCISSORS));
    }
}
