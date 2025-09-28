package de.thokari.rps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest {

    @Test
    public void testAlwaysPaperAlwaysPlaysPaper() {
        // Given
        Player alwaysPaper = new Player.AlwaysPaper();
        // When
        for (int i = 1; i <= 100; i++) {
            Move move = alwaysPaper.nextMove();
            // Then
            Assertions.assertEquals(Move.PAPER, move);
        }
    }

    @Test
    public void testRandomMoveMakesSeedDependentMoves() {
        // Given
        Integer rngSeed = 1;
        Player randomPlayer = new Player.RandomMove(rngSeed);
        List<Move> moves = new ArrayList<>();
        List<Move> expectedMoves = List.of(
                Move.ROCK, Move.PAPER, Move.PAPER, Move.ROCK, Move.SCISSORS,
                Move.PAPER, Move.SCISSORS, Move.PAPER, Move.PAPER, Move.PAPER,
                Move.PAPER, Move.PAPER, Move.PAPER, Move.ROCK, Move.ROCK,
                Move.PAPER, Move.SCISSORS, Move.ROCK, Move.ROCK, Move.SCISSORS
        );
        // When
        for (int i = 1; i <= 20; i++) {
            moves.add(randomPlayer.nextMove());
        }
        // Then
        Assertions.assertEquals(expectedMoves, moves);
    }
}
