package com.oop_lab.lab1;

public class Lab1 {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("grey", 23,1080);
        Monitor monitor2 = new Monitor("white", 17, 720);

        if (monitor1.resolution > monitor2.resolution) {
        System.out.println("first monitor has better resolution");
        }
        else {
            System.out.println("second monitor has better resolution");
        }
    }
}
        class Monitor {
            public String color;
            public int dimensions;
            public int resolution;

            public Monitor(String c, int d, int r) {
                color = c;
                dimensions = d;
                resolution = r;
            }
        }



