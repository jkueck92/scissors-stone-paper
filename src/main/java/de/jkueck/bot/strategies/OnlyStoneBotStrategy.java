package de.jkueck.bot.strategies;

import de.jkueck.shapes.Shape;
import de.jkueck.shapes.Stone;

public class OnlyStoneBotStrategy extends BotStrategy {

    @Override
    public Shape choseShape() {
        return this.getFirstShape();
    }

    @Override
    void addShape() {
        this.getPossibleShapes().add(new Stone());
    }

}
