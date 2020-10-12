package com.oop_lab.lab2;

public class Main {
    public static void main(String[] args) {

    Box box1 = new Box();
    Box box2 = new Box(2);
    Box box3 = new Box(2, 5, 6);
    
    }
}
class Box {
    int height;
    int width;
    int depth;

    public Box() {
        height = 1;
        width = 1;
        depth =1;
    }
    public Box(int size) {
        height = size;
        width = size;
        depth = size;
    }
    public Box(int h, int w, int d) {
        height = h;
        width = w;
        depth = d;
    }

    //advanced level

    public int Volume() {
        return height * width * depth;
    }
    public int Surface() {
        return (2 * height * width) + (2 * width * depth) + (2 * depth * height);
    }

    public
}
