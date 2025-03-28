package com.gayatri.StreamPrograms.MapComplexProblems;

public class Student {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " : " + marks;
    }
}
