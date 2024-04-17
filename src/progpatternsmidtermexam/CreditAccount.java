/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpatternsmidtermexam;

/**
 *
 * @author 2319522
 */
public class CreditAccount extends Account {
    public CreditAccount() {}
    
    public CreditAccount(String ID, String firstName, String lastName, double balance) {
        super(ID, firstName, lastName, balance);
    }

    @Override
    public String getType() {
        return "Credit";
    }
    
    @Override
    public String toString() {
        return Internationalization.getMessage("creditAccount") + " " + super.toString();
    }
}
