package de.thokari.rps;

import java.util.List;

public class  Main {
    public static void main(String[] args) {

        int numRounds = 100;

        if (args.length > 1) {
            System.err.println("Please provide at most a single parameter as RNG seed (number)!");
        }

        Integer rngSeed = null;
        if (args.length == 1) {
            try {
                rngSeed = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Please provide a valid RNG seed (number)!");
            }
        }

        Player player1 = new Player.AlwaysPaper();
        Player player2 = new Player.RandomMove(rngSeed);

        Game game = new Game(player1, player2, numRounds);
        List<Round> rounds = game.play();

        printRounds(rounds);
    }

    private static void printRounds(List<Round> rounds) {
        int player1Wins = 0;
        int player2Wins = 0;
        int draws = 0;
        for (Round round : rounds) {
            System.out.println(round);
            if (round.result == 1) {
                player1Wins++;
            } else if (round.result == -1) {
                player2Wins++;
            } else {
                draws++;
            }
        }
        System.out.println("-----------------------------------\n"
                + "P1: " + player1Wins + " " + "P2: " + player2Wins + " " + "Draws: " + draws);
    }
}
