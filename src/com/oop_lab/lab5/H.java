package com.oop_lab.lab5;

public class H extends G{

    protected String h;

    public H(String h, X x) {
        super("h", x);
        this.h = h;
    }

    public String toString() {
        return super.toString() + ", h value = " + h;
    }
}
