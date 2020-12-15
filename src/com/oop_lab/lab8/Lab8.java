package com.oop_lab.lab8;

import java.util.stream.Stream;

public class Lab8 {
    public static void main(String[] args) {
        GeometricBody[] bodies = new GeometricBody[] {
                new Cube(5),
                new Sphere(4),
                new Parallelepiped(5,6,7),
        };

    }

    static GeometricBody GetMaxVolume(GeometricBody[] objs) {
        return Stream.of(objs).max((obj1, obj2) -> obj1.getVolume() - obj2.getVolume() > 0 ? 1 : -1).get();
    }

    static GeometricBody GetMaxSurface(GeometricBody[] objs) {
        return Stream.of(objs).max((obj1, obj2) -> obj1.getSurface() - obj2.getSurface() > 0 ? 1 : -1).get();
    }
}
