package de.jkueck.bot;

import de.jkueck.bot.strategies.BotStrategy;

public class Bot {

    private String name;

    private BotStrategy strategy;

    public Bot(String name, BotStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public BotStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(BotStrategy strategy) {
        this.strategy = strategy;
    }

}
