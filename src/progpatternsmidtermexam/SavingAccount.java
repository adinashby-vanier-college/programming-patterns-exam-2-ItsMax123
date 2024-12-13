/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpatternsmidtermexam;

/**
 *
 * @author 2319522
 */
public class SavingAccount extends Account {
    public SavingAccount() {}
    
    public SavingAccount(String ID, String firstName, String lastName, double balance) {
        super(ID, firstName, lastName, balance);
    }

    @Override
    public String getType() {
        return "Saving";
    }
    
    @Override
    public String toString() {
        return Internationalization.getMessage("savingAccount") + " " + super.toString();
    }
}
