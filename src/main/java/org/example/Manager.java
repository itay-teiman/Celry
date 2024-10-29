package org.example;

public class Manager {

    private  double  MonthlySalary;

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        MonthlySalary = monthlySalary;
    }

    public double  salary(){
        return  getMonthlySalary();
    }
}
