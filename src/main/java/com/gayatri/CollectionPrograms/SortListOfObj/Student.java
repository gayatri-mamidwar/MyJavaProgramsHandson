package com.gayatri.CollectionPrograms.SortListOfObj;

public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private double marks;
    private int age;

    public Student(int id, String name, double marks, int age) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                " name='" + name + '\'' +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }

    //Using Comparable. default sort by age
    public int compareTo(Student other) {
        return this.age - other.age;
    }
}
