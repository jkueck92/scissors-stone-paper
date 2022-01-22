package de.jkueck.shapes;

import de.jkueck.utils.Result;

public class Stone extends Shape {

    @Override
    public String getName() {
        return "Stone";
    }

    @Override
    public Result play(Shape shape) {
        if (shape instanceof Stone) {
            return Result.UNDECIDED;
        } else if (shape instanceof Scissors) {
            return Result.WIN;
        } else if (shape instanceof Paper) {
            return Result.LOSE;
        } else {
            throw new IllegalArgumentException();
        }
    }



}
