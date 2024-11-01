package org.example;

public class Worker extends Employee {
     private  double BaseSalary;
     private  double WorkingHours;



    public Worker(string id, string lastName, string firstName, string address, string dateOFBirth, string emplId, string department, string dateOfStart, double baseSalary, double workingHours) {
        super(id, lastName, firstName, address, dateOFBirth, emplId, department, dateOfStart);
        BaseSalary = baseSalary;
        WorkingHours = workingHours;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        BaseSalary = baseSalary;
    }

    public double getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(double workingHours) {
        WorkingHours = workingHours;
    }

//    public double  salary(){
//        return  this.BaseSalary*this.WorkingHours;
//
//    }


    @Override
    public <T> Object salary() {
        return this.BaseSalary*this.WorkingHours;
    }

    @Override
    public String  toString() {
        return "Worker{" +
                "BaseSalary=" + BaseSalary +
                ", WorkingHours=" + WorkingHours +
                '}';
    }
}
