package com.oop_lab.lab5;

public class E extends D {

    protected String e;

    public E(String e, X x) {
        super("d", x);
        this.e = e;
    }

    public String toString() {
        return super.toString() + ", e value = " + e;
    }
}
