package com.oop_lab.lab5;

public class A {
    protected String a;
    protected X x = new X("x");

    public A(String a,X x) {
        this.a = a;
        this.x = x;
    }

    public A(String a) {
    }

    public String toString() {
        return "a value = " + a + ", x value = " + x.getVal();
    }
}
