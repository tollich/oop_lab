package com.oop_lab.lab5;

public class F extends E {

    protected String f;

    public F(String f, X x) {
        super("e", x);
        this.f = f;
    }

    public String toString() {
        return super.toString() + ", f value = " + f;
    }
}
