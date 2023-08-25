package com.workintech.javainheritance.company;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(1500);
        System.out.println(getName() + " developer starts to working");
    }
}
