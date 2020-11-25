package com.oop_lab.lab5;

public class J extends I{

    protected String j;

    public J(String j, X x) {
        super("i", x);
        this.j = j;
    }

    public String toString() {
        return super.toString() + ", j value = " + j;
    }
}
