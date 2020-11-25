package com.oop_lab.lab5;

public class D extends C {

    protected String d;

    public D(String d, X x) {
        super("c", x);
        this.d = d;
    }

    public String toString() {
        return super.toString() + ", d value = " + d;
    }
}
