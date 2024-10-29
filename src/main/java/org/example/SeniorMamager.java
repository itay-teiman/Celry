package org.example;

public class SeniorMamager {

    private  double Bonus;
    private  Manager M1;

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
    public  double salary(){
        return  this.M1.getMonthlySalary()+this.Bonus;
    }
}
