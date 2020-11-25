package com.oop_lab.lab5;

public class B extends A
    {
        protected String b;

        public B(String b, X x) {
            super("a", x);
            this.b = b;
        }

        public String toString() {
            return super.toString() + ", b value = " + b;
        }
    }
