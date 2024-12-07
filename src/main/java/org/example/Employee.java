package org.example;

public class Employee extends Person{
    private  string emplId;
    private   string department;
    private  int DateOfStart;



    public Employee(string id, string lastName, string firstName, string address, int dateOFBirth, string emplId, string department, int dateOfStart) {
        super(id, lastName, firstName, address, dateOFBirth);
        this.emplId = emplId;
        this.department = department;
        DateOfStart = dateOfStart;
    }

    public string getEmplId() {
        return emplId;
    }

    public void setEmplId(string emplId) {
        this.emplId = emplId;
    }

    public string getDepartment() {
        return department;
    }

    public void setDepartment(string department) {
        this.department = department;
    }

    public int getDateOfStart() {
        return DateOfStart;
    }

    public void setDateOfStart(int dateOfStart) {
        DateOfStart = dateOfStart;
    }
    public <T> Object salary(){
        return null;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "emplId=" + emplId +
                ", department=" + department +
                ", DateOfStart=" + DateOfStart +
                '}';
    }
    //
}
