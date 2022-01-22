package de.jkueck.shapes;

import de.jkueck.utils.Result;

public class Paper extends Shape {

    @Override
    public String getName() {
        return "Paper";
    }

    @Override
    public Result play(Shape shape) {
        if (shape instanceof Paper) {
            return Result.UNDECIDED;
        } else if (shape instanceof Stone) {
            return Result.WIN;
        } else if (shape instanceof Scissors) {
            return Result.LOSE;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
