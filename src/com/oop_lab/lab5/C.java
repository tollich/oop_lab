package com.oop_lab.lab5;

public class C extends B {

    protected String c;

    public C(String c, X x) {
        super("b", x);
        this.c = c;
    }

    public String toString() {
        return super.toString() + ", c value = " + c;
    }
}
