package org.example;

public class SalesMan extends Employee {
    private  int TotalSales;



    public SalesMan(string id, string lastName, string firstName, string address, string dateOFBirth, string emplId, string department, int dateOfStart, int totalSales) {
        super(id, lastName, firstName, address, dateOFBirth, emplId, department, dateOfStart);
        TotalSales = totalSales;
    }

    public int getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(int totalSales) {
        TotalSales = totalSales;
    }


    @Override
    public <T> Object salary() {
        return this.TotalSales*0.15;
    }


    @Override
    public String toString() {
        return "SalesMan{" +
                "TotalSales=" + TotalSales +
                '}';
    }
}
