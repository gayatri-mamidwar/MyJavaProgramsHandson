package com.gayatri.StreamPrograms.MapComplexProblems;

public class Employee {
    Long id;
    String name;
    String deptName;
    double salary;

    public Employee(Long id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  name + " : " + salary;
    }
}
