package com.oop_lab.lab2;

public class Main {
    public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box(2.4f);
    Box box3 = new Box(2.4f, 5.1f, 6f);
    }
}
class Box {
    float height;
    float width;
    float depth;

    public Box() {
        height = 1;
        width = 1;
        depth =1;
    }
    public Box(float size) {
        height = size;
        width = size;
        depth = size;
    }
    public Box(float h, float w, float d) {
        height = h;
        width = w;
        depth = d;
    }
}
