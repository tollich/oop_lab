package com.oop_lab.lab5;

public class Lab5 {
    public static void main(String[] args) {

        X x = new X("X");

        A a = new A("A", x);
        System.out.println(a);

        B b = new B("B", x);
        System.out.println(b);

        C c = new C("C", x);
        System.out.println(c);

        D d = new D("D", x);
        System.out.println(d);

        E e = new E("E", x);
        System.out.println(e);

        F f = new F("F",x);
        System.out.println(f.toString());

        G g = new G("G",x);
        System.out.println(g.toString());

        H h = new H("H",x);
        System.out.println(h.toString());

        I i = new I("I", x);
        System.out.println(i.toString());

        J j = new J("J", x);
        System.out.println(j.toString());
    }
}
