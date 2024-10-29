package org.example;

public class SalesMan {
    private  int TotalSales;

    public int getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(int totalSales) {
        TotalSales = totalSales;
    }

    public double salary(){
        return  this.TotalSales*0.15;
    }
}
