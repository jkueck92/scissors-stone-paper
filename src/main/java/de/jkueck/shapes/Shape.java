package de.jkueck.shapes;

import de.jkueck.utils.Result;

public abstract class Shape {

    public abstract String getName();

    public abstract Result play(Shape shape);

}
