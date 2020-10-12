package com.oop_lab.lab1;

public class Advanced_Level {
    public static void main(String[] args){
        Students st1 = new Students("Tolici Constantin", 20, 8.5f);
        Students st2 = new Students("Shishkov Piotr", 18, 8.4f);
        Students st3 = new Students("Maslihov Vladislav", 20, 8.45f);
        Students st4 = new Students("Prozorov Kate", 19, 6.5f);
        Students st5 = new Students("Vinograd Arteom", 20, 8.99f);
        Students st6 = new Students("Tenderly Bae", 22, 7.4f);
        Students st7 = new Students("Bat9 Evelon", 28, 6.6f);
        Students st8 = new Students("Blanar Bidla", 20, 8.23f);
        Students st9 = new Students("Shoshkov Nadea", 22, 9.14f);
        Students st10 = new Students("Ribak Dasha", 20, 8.2f);

        Students[] UtmStudents = new Students[] {st1,st2,st3};
        Students[] AsemStudents = new Students[] {st4,st5,st6,st7};
        Students[] MedStudents = new Students[] {st8,st9,st10};

        University university1 = new University("UTM", 1964, UtmStudents);
        University university2 = new University("ASEM", 1991,AsemStudents);
        University university3 = new University("MED", 1945, MedStudents);

        for (University u: new University[] {university1,university2,university3}){
            float avg = 0f;
            for(Students s: u.students) {
                avg += s.mark;
            }
            avg/=u.students.length;
            System.out.println("\nAverage mark for "+u.name+" is "+avg);
        }
    }
}

class Students{
    public String name;
    public int age;
    public float mark;

    public Students(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
}

class University {
    public String name;
    public int foundationYear;
    Students[] students;

    public University(String name, int foundationYear,Students[] students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
    }

}
