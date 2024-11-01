package org.example;

public class Person {
    private string id;
    private string LastName;
    private  string FirstName;
    private string Address;
    private  string DateOFBirth;

    public Person(string id, string lastName, string firstName, string address, string dateOFBirth) {
        this.id = id;
        LastName = lastName;
        FirstName = firstName;
        Address = address;
        DateOFBirth = dateOFBirth;
    }

    public Person() {

    }

    public string getLastName() {
        return LastName;
    }

    public void setLastName(string lastName) {
        LastName = lastName;
    }

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public string getFirstName() {
        return FirstName;
    }

    public void setFirstName(string firstName) {
        FirstName = firstName;
    }

    public string getAddress() {
        return Address;
    }

    public void setAddress(string address) {
        Address = address;
    }

    public string getDateOFBirth() {
        return DateOFBirth;
    }

    public void setDateOFBirth(string dateOFBirth) {
        DateOFBirth = dateOFBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", LastName=" + LastName +
                ", FirstName=" + FirstName +
                ", Address=" + Address +
                ", DateOFBirth=" + DateOFBirth +
                '}';
    }
}
