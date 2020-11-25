package com.oop_lab.lab6;


import java.util.List;

public class Hospital {
    String name;
    Address address;
    Phone phone;

    private List<Departament> departaments;

    Hospital (String name, Address address, Phone phone, List<Departament> departaments) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departaments = departaments;
    }
}
