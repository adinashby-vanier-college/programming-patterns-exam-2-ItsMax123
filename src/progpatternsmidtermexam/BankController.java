/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpatternsmidtermexam;

import java.util.List;

/**
 *
 * @author 2319522
 */
public class BankController {
    private BankModel model = BankModel.getInstance();
    
    public void addAccount(Account account) {
        List<Account> accounts = model.getAccounts();
        accounts.add(account);
        model.setAccounts(accounts);
    }
    
    public void payInterest() {
        for (Account account: model.getAccounts()) {
            if (account.getType().equals("Saving")) {
                account.balance *= model.getInterestRate();
            }
        }
    }
    
    public double getInterestRate() {
        return model.getInterestRate();
    }
    
    public void setInterestRate(double interest) {
        model.setInterestRate(interest);
    }
}
