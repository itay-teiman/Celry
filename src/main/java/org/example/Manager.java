package org.example;

public class Manager extends Employee {

    private  double  MonthlySalary;


    public Manager(string id, string lastName, string firstName, string address, string dateOFBirth, string emplId, string department, int dateOfStart, double monthlySalary) {
        super(id, lastName, firstName, address, dateOFBirth, emplId, department, dateOfStart);
        MonthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        MonthlySalary = monthlySalary;
    }

    @Override
    public <T> Object salary() {
        return MonthlySalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "MonthlySalary=" + MonthlySalary +
                '}';
    }
}
