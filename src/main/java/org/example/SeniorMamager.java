package org.example;

public class SeniorMamager extends Manager {

    private  double Bonus;
    private  Manager M1;


    public SeniorMamager(string id, string lastName, string firstName, string address, string dateOFBirth, string emplId, string department, string dateOfStart, double monthlySalary, double bonus, Manager m1) {
        super(id, lastName, firstName, address, dateOFBirth, emplId, department, dateOfStart, monthlySalary);
        Bonus = bonus;
        M1 = m1;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }
    public Manager getM1() {
        return M1;
    }

    public void setM1(Manager m1) {
        M1 = m1;
    }


    @Override
    public <T> Object salary() {
        return  this.M1.getMonthlySalary()+this.Bonus;
    }

    @Override
    public String toString() {
        return "SeniorMamager{" +
                "Bonus=" + Bonus +
                ", M1=" + M1 +
                '}';
    }
}
