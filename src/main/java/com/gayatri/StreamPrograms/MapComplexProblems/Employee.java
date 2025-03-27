package com.gayatri.StreamPrograms.MapComplexProblems;

public class Employee {
    Long id;
    String name;
    String deptName;

    public Employee(Long id, String name, String deptName) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return id + " : " + deptName + " : " + name;
    }
}
