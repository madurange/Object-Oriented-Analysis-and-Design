/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab5;

/**
 *
 * @author pgusthin
 */
public class Manager extends UserProfile {
    
    
    public Manager(String userName, String password){
        super(userName, password,"Manager");
    }
    
    protected Customer CreateNewCustomer(String userName,String password){
        return new Customer(userName, password);
    }
    
    protected ChequingAcc CreateNewChequingAcc(UserProfile user,double balance){
        if(balance>=20){
            return new ChequingAcc(user, balance);
        }else{
            return null;
        }
        
    }
    
    protected SavingsAcc CreateNewSavingsAcc(UserProfile user,double balance){
        if(balance>=20){
            return new SavingsAcc(user, balance);
        }else{
            return null;
        }
    }
    
    
    protected void DeleteCustomer(String userName){
        
    }

    @Override
    public String toString() {
        return "Manager{" + '}';
    }
    
    public boolean repOK(){
        return true;
    }
    
}
