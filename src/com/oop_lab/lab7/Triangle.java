package com.oop_lab.lab7;

public class Triangle extends Figure {
    public double FirstSide;
    public double SecondSide;
    public double ThirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        FirstSide = firstSide;
        SecondSide = secondSide;
        ThirdSide = thirdSide;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - FirstSide) * (p - SecondSide) * (p - ThirdSide));
    }

    @Override
    public double getPerimeter() {
        return FirstSide + SecondSide + ThirdSide;
    }
}
