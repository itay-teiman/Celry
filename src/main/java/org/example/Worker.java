package org.example;

public class Worker {
     private  double BaseSalary;
     private  double WorkingHours;

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

    public double  salary(){
        return  this.BaseSalary*this.WorkingHours;

    }
}
