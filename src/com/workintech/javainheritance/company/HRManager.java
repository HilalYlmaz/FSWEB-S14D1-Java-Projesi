package com.workintech.javainheritance.company;

public class HRManager extends  Employee{
    private  JuniorDeveloper[] junior;
    private MidDeveloper[] mid;
    private SeniorDeveloper[] senior;
    public HRManager(long id, String name, double salary, JuniorDeveloper[] junior, MidDeveloper[] mid, SeniorDeveloper[] senior ) {
        super(id, name, salary);
        this.junior= junior;
        this.mid= mid;
        this.senior= senior;
    }
    public void addEmployee (int index, JuniorDeveloper developer){
        try{
            if(junior[index]== null){
                junior[index]= developer;
            }else{
                System.out.println("bu index zaten dolu");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("index bulunamadı" + ex.getMessage());
        }

    }
    public void addEmployee (int index, MidDeveloper developer){
        try{
            if(mid[index]== null){
                mid[index]= developer;
            }else{
                System.out.println("bu index zaten dolu");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("index bulunamadı" + ex.getMessage());
        }

    }
    public void addEmployee (int index, SeniorDeveloper developer){
        try{
            if(senior[index]== null){
                senior[index]= developer;
            }else{
                System.out.println("bu index zaten dolu");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("index bulunamadı" + ex.getMessage());
        }

    }


    @Override
    public void work() {
        setSalary(8000);
        System.out.println(getName()+ " developer starts to working");
    }
}
