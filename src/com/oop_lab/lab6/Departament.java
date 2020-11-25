package com.oop_lab.lab6;

import java.util.List;


public class Departament {
    String name;
    private List<Staff> staff;

    Departament (String name, List<Staff> staff) {
        this.name = name;
        this.staff = staff;
    }
}
