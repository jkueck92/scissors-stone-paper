package de.jkueck;

import de.jkueck.bot.Bot;
import de.jkueck.bot.strategies.OnlyStoneBotStrategy;
import de.jkueck.bot.strategies.RandomBotStrategy;
import de.jkueck.game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, Bots werden erzeugt....");

        Bot bot1 = new Bot("Bot1", new RandomBotStrategy());
        Bot bot2 = new Bot("Bot2", new OnlyStoneBotStrategy());

        this.setStrategy(scanner, bot1);

        this.setStrategy(scanner, bot2);

        System.out.println("Wie viele spiele sollen gespielt werden?");

        int gameCount = 3;
        if (scanner.hasNextInt()) {
            gameCount = scanner.nextInt();
        } else {
            System.out.println("Falsche Eingabe, es werden 3 Spiele gespielt.");
        }

        System.out.println("Viel spaß, dass Spiel beginnt...");

        Game game = new Game(bot1, bot2, gameCount);

        game.start();
    }

    public void setStrategy(Scanner scanner, Bot bot) {
        System.out.println("Welche Strategie soll (bot1) spielen?");
        System.out.println("1: only stone");
        System.out.println("2: random");

        String input = scanner.next();

        if (input.equals("1")) {
            bot.setStrategy(new OnlyStoneBotStrategy());
        } else if (input.equals("2")) {
            bot.setStrategy(new RandomBotStrategy());
        } else {
            System.out.println("Strategie nicht vorhanden, waehle zufaellige Strategie.");
            bot.setStrategy(new RandomBotStrategy());
        }
    }

}
