package de.thokari.rps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static de.thokari.rps.Move.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testAlwaysPaperAlwaysPlaysPaper() {
        // Given
        Player alwaysPaper = new Player.AlwaysPaper();
        // When
        for (int i = 1; i <= 100; i++) {
            Move move = alwaysPaper.nextMove();
            // Then
            assertEquals(PAPER, move);
        }
    }

    @Test
    public void testRandomMoveMakesSeedDependentMoves() {
        // Given
        Integer rngSeed = 1;
        Player randomPlayer = new Player.RandomMove(rngSeed);
        List<Move> moves = new ArrayList<>();
        List<Move> expectedMoves = List.of(
                ROCK, PAPER, PAPER, ROCK, SCISSORS,
                PAPER, SCISSORS, PAPER, PAPER, PAPER,
                PAPER, PAPER, PAPER, ROCK, ROCK,
                PAPER, SCISSORS, ROCK, ROCK, SCISSORS
        );
        // When
        for (int i = 1; i <= expectedMoves.size(); i++) {
            moves.add(randomPlayer.nextMove());
        }
        // Then
        assertEquals(expectedMoves, moves);
    }
}
