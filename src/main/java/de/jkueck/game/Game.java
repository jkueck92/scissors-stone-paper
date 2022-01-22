package de.jkueck.game;

import de.jkueck.utils.GameResult;
import de.jkueck.utils.Result;
import de.jkueck.bot.Bot;
import de.jkueck.shapes.Shape;

public class Game {

    private int gameCount = 3;

    private Bot bot1;

    private Bot bot2;

    public Game(Bot bot1, Bot bot2, int gameCount) {
        this.bot1 = bot1;
        this.bot2 = bot2;
        this.gameCount = gameCount;
    }


    public void start() {
        System.out.println("Starte das Spiel mit (" + this.bot1.getName() + ") und (" + this.bot2.getName() + "), Anzahl der Spiele (" + this.gameCount + ")");
        System.out.println("-----------------------------");

        int actualGameCount = 1;

        GameResult gameResult = new GameResult();

        while (actualGameCount <= this.gameCount) {
            System.out.println("Spiele Spiel (" + actualGameCount + ")");

            Shape shape1 = this.bot1.getStrategy().choseShape();
            System.out.println(this.bot1.getName() + ": " + shape1.getName());

            Shape shape2 = this.bot2.getStrategy().choseShape();
            System.out.println(this.bot2.getName() + ": " + shape2.getName());

            Result result = shape1.play(shape2);

            this.gameResult(result, gameResult);

            System.out.println("-------------------------");

            actualGameCount++;

        }

        System.out.println("Spielergebniss result");
        System.out.println("(" + this.bot1.getName() + ") hat (" + gameResult.getWinCountBot1() + ") von (" + gameCount + ") Spielen gewonnen.");
        System.out.println("(" + this.bot2.getName() + ") hat (" + gameResult.getWinCountBot2() + ") von (" + gameCount + ") Spielen gewonnen.");
        System.out.println("Unentschieden (" + gameResult.getUndecidedCount() + ")");
        System.out.println("-------------------------");

        if (gameResult.isBot1TheWinner()) {
            System.out.println("(" + this.bot1.getName() + ") hat das Spiel gewonnen!" );
        } else {
            System.out.println("(" + this.bot2.getName() + ") hat das Spiel gewonnen!" );
        }

    }

    private void gameResult(Result result, GameResult gameResult) {
        if (result.equals(Result.WIN)) {
            System.out.println("(" + this.bot1.getName() + ") hat gewonnen!");
            gameResult.addWinCountBot1();
        } else if (result.equals(Result.LOSE)) {
            System.out.println("(" + this.bot2.getName() + ") hat gewonnen!");
            gameResult.addWinCountBot2();
        } else {
            System.out.println("Unentschieden!");
            gameResult.addUndecidedCount();
        }
    }

}
