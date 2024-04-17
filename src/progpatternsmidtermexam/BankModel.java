/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpatternsmidtermexam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2319522
 */
public class BankModel {
    
    private static BankModel instance;
    private double interestRate;
    private List<Account> accounts;
    
    private BankModel() {
        interestRate = 1.01;
        accounts = new ArrayList<>();
    }

    public static BankModel getInstance() {
        if (instance == null) {
            instance = new BankModel();
        }
        return instance;
    }
    
    public BankModel(double interestRate) {
        this.interestRate = interestRate;
        accounts = new ArrayList<>();
    }
    
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
