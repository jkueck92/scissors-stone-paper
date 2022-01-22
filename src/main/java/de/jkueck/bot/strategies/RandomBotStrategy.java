package de.jkueck.bot.strategies;

import de.jkueck.shapes.Paper;
import de.jkueck.shapes.Scissors;
import de.jkueck.shapes.Shape;
import de.jkueck.shapes.Stone;

import java.util.Random;

public class RandomBotStrategy extends BotStrategy {

    @Override
    public Shape choseShape() {
        return this.getRandomShape();
    }

    @Override
    void addShape() {
        this.getPossibleShapes().add(new Scissors());
        this.getPossibleShapes().add(new Stone());
        this.getPossibleShapes().add(new Paper());
    }

    private Shape getRandomShape() {
        Random random = new Random();
        int randomIndex =  random.nextInt(this.getPossibleShapes().size());
        return this.getPossibleShapes().get(randomIndex);
    }

}
