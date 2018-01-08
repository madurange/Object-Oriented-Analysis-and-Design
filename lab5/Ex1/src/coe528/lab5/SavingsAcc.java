/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab5;

/**
 *
 * @author pgusthin
 */
public class SavingsAcc extends Account {
    private static int SavingsAccCounter=0;
    
    public SavingsAcc(UserProfile user, double balance){
        super(user, balance);
        setAccNum(String.format("S"+"%09d", ++SavingsAccCounter));
    }
    
}
