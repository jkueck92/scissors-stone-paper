package de.jkueck.shapes;

import de.jkueck.utils.Result;

public class Scissors extends Shape {

    @Override
    public String getName() {
        return "Scissors";
    }

    @Override
    public Result play(Shape shape) {
        if (shape instanceof Scissors) {
            return Result.UNDECIDED;
        } else if (shape instanceof Paper) {
            return Result.WIN;
        } else if (shape instanceof Stone) {
            return Result.LOSE;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
