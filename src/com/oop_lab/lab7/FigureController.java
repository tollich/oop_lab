package com.oop_lab.lab7;

import java.util.ArrayList;
import java.util.Arrays;

public class FigureController {
    public static Figure getMaxArea(ArrayList<Figure> figures) {
        Figure[] figArray = figures.toArray(new Figure[0]);
        return Arrays.stream(figArray).max((f1, f2) -> f1.getArea() - f2.getArea() > 0 ? 1: -1).get();
    }

    public static Figure getMaxPerimeter(ArrayList<Figure> figures) {
        Figure[] figArray = figures.toArray(new Figure[0]);
        return Arrays.stream(figArray).max((f1, f2) -> f1.getPerimeter() - f2.getPerimeter() > 0 ? 1 : -1).get();
    }

    public static void main(String[] args) {
        ArrayList<Figure> figureList = new ArrayList<Figure>();
        figureList.add(new Square(6));
        figureList.add(new Rectangle(4,6));
        figureList.add(new Triangle(17,17,30));

        Figure max = getMaxArea(figureList);
        System.out.println("Max Area: " + max.getArea());

        max = getMaxPerimeter(figureList);
        System.out.println("Max Perimeter: " + max.getPerimeter());

         /*var circle = new Figure() {
             double r = 5;

             @Override
             public double getArea() {
                 return Math.PI * r * r;
             }

             @Override
             public double getPerimeter() {
                return 2 * Math.PI * r; */
             }

        }





