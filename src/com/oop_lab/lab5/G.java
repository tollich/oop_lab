package com.oop_lab.lab5;

public class G extends F {

    protected String g;

    public G(String g, X x) {
        super("f", x);
        this.g = g;
    }

    public String toString() {
        return super.toString() + ", g value = " + g;
    }
}
