/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpatternsmidtermexam;

/**
 *
 * @author 2319522
 */
public class BankView {
    BankModel model = BankModel.getInstance();
    
    public String getString() {
        String output = "";
        for (Account account: model.getAccounts()) {
            output += account.toString() + "\n";
        }
        return output;
    }
}
