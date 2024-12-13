/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpatternsmidtermexam;

/**
 *
 * @author 2319522
 */
public abstract class Account {
    String ID;
    String firstName;
    String lastName;
    double balance;
    
    public Account() {
        
    }
    
    public Account(String ID, String firstName, String lastName, double balance) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract String getType();
    
    @Override
    public String toString() {
        return "(" + ID + ") " + lastName + ", " + firstName + ": $" + balance;
    }
}
