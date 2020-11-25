package com.oop_lab.lab7;

public class Square extends Figure {
    public double Length;

    public Square(double length) {
        this.Length = length;
    }

    @Override
    public double getArea() {
        return Length * Length;
    }

    @Override
    public double getPerimeter() {
        return Length * 4;
    }
}
