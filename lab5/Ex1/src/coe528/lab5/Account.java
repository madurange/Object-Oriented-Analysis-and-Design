/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab5;

/**
 *
 * @author pgusthin
 */
public abstract class Account {
    // Overview: Account is a abstract class for chequing and savings account whose balance should more than zero.
    // The abstraction function:    
    //   AF(C) = A account either Chequing or Savings,
    //           where;
    //           C.user = The Customer of the account
    //           C.accNum= The account number of the account
    //           C.balance= The balance of the account
    //             
    // The rep invariant: 
    //   C.balance >= 0.0

    
    //the rep  
    private UserProfile user;
    private String accNum;
    private double balance;

    /**
     *
     * @param user The Customer of the account
     * @param balance The balance of the account
     */
    public Account(UserProfile user, double balance) {
        // EFFECTS: Creates a new ChequingAcc or SavingsAcc object  
        this.user = user;
        this.balance = balance;
    }

    /**
     * Returns The Customer of the account
     * @return
     */
    protected UserProfile getUser() {
        return user;
    }

    /**
     * Returns The account number of the account
     * @return
     */
    protected String getAccNum() {
        return accNum;
    }

    /**
     * Returns The balance of the account
     * @return
     */
    protected double getBalance() {
        return balance;
    }

    /**
     * Sets The Customer of the account
     * @param user The Customer of the account
     */
    protected void setUser(UserProfile user) {
        this.user = user;
    }

    /**
     * Sets The account number of the account
     * @param accNum The account number of the account
     */
    protected void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    /**
     * Sets The balance of the account
     * @param balance The balance of the account
     */
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "user=" + user + ", accNum=" + accNum + ", balance=" + balance + '}';
    }
    
    /**
     * Returns true if rep invariant is true
     * @return
     */
    public boolean repOK(){
        // EFFECTS: Returns true if the rep invariant holds for this            
        //          object; otherwise returns false 
        return balance>=0.0;
    }
    
    
    
}
