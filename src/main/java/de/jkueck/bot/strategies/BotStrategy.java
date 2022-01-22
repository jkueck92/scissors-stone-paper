package de.jkueck.bot.strategies;

import de.jkueck.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public abstract class BotStrategy {

    private List<Shape> possibleShapes = new ArrayList<>();

    public abstract Shape choseShape();

    abstract void addShape();

    public List<Shape> getPossibleShapes() {
        return this.possibleShapes;
    }

    public BotStrategy() {
        this.addShape();
    }

    public Shape getFirstShape() {
        if (this.possibleShapes != null && this.possibleShapes.size() == 1) {
            return this.possibleShapes.get(0);
        }
        throw new IllegalArgumentException("can not get only first shape, multiple available");
    }

}
