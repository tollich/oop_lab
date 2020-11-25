package com.oop_lab.lab5;

public class I extends H {

    protected String i;

    public I(String i, X x) {
        super("h", x);
        this.i = i;
    }

    public String toString() {
        return super.toString() + ", i value = " + i;
    }
}
