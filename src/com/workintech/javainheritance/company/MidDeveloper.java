package com.workintech.javainheritance.company;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(3000);
        System.out.println(getName() +  " developer starts to working");
    }
}
