/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab5;

/**
 *
 * @author pgusthin
 */
public class Customer extends UserProfile{
    private Account accountC;
    private Account accountS;
    
    
    public Customer(String userName,String password){
        super(userName, password,"Customer");
    }

    public Account getAccountC() {
        return accountC;
    }

    public Account getAccountS() {
        return accountS;
    }

    public void setAccountC(ChequingAcc accountC) {
        this.accountC = accountC;
    }

    public void setAccountS(SavingsAcc accountS) {
        this.accountS = accountS;
    }
    
    
    protected double viewBalance(Account account){
        return account.getBalance();
    }
    
    protected boolean transfer(double amount, Account from, Account to){
        if(from.getBalance()>=amount){
            from.setBalance(from.getBalance()-amount);
            to.setBalance(to.getBalance()+amount);
            return true;
        }else{
            return false;
        }
        
    } 
    
    
}
