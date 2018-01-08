/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab5;

/**
 *
 * @author pgusthin
 */
public abstract class UserProfile {
    // Overview: Account is a abstract class for Manager and Customer
    // The abstraction function:    
    //   AF(C) = A actor either Manager or Customer,
    //           where;
    //           C.userName = UserName of the actor
    //           C.password= password for the username
    //           C.role= Role of the actor. either "Manager" or "Customer" 
    //             
    // The rep invariant: 
    //   (role=="Manager" || role=="Customer")
    
    
    //rep
    private String userName;
    private String password;
    final private String role;

    public UserProfile(String userName, String password,String role) {
        this.userName = userName;
        this.password = password;
        this.role=role;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
