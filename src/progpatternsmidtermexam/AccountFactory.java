/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpatternsmidtermexam;

/**
 *
 * @author 2319522
 */
public class AccountFactory {
    public static Account getAccount(String type) {
        if (type.equals("Credit")) return new CreditAccount();
        if (type.equals("Saving")) return new SavingAccount();
        return new CheckingAccount();
    }
}
