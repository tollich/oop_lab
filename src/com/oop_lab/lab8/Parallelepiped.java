package com.oop_lab.lab8;

public class Parallelepiped implements GeometricBody{
    public double width;
    public double height;
    public double length;

    Parallelepiped(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public double getSurface() {
        return 2 * height * (width + 2 * length);
    }
    @Override
    public double getVolume() {
        return  height * width * length;
    }
}
