/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab5;

/**
 *
 * @author pgusthin
 */
public class ChequingAcc extends Account {
    private static int ChequingAccCounter=0;
    
    public ChequingAcc(UserProfile user, double balance){
        super(user, balance);
        setAccNum(String.format("C"+"%09d", ++ChequingAccCounter));
    }
}
