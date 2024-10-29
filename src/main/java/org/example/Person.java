package org.example;

public class Person {
    private string id;
    private string LastName;
    private  string FirstName;
    private string Address;
    private  string DateOFBirth;

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
}
