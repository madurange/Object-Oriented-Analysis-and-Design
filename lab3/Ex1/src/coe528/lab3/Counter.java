/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 * Defines the functionalities of a basic up-down counter
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public interface Counter {

    /**
     * Return the current value of the counter as a String
     * @return The current value of the counter
     */
    //Requires: None
    //Modifies: None
    //Effects:  Return the count of the odometer as a String
    public String count();

    /**
     * Increments the counter
     */
    //Requires: None
    //Modifies: The value of the digits in odometer
    //Effects:  Increment the value of the odometer by 1 
    public void increment();

    /**
     * Decrements the counter
     */
    //Requires: None
    //Modifies: The value of the digits in odometer
    //Effects:  Decrement the value of the odometer by 1 
    public void decrement();

    /**
     * Resets the counter
     */
    //Requires: None
    //Modifies: The value of the digits in odometer
    //Effects:  Set the value of the odometer to all zeros
    public void reset();
}
