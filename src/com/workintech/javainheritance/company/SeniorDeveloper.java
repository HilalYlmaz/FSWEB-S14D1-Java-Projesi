package com.workintech.javainheritance.company;

public class SeniorDeveloper extends  Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(5000);
        System.out.println(getName() + " developer starts to working");
    }
}
