/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 * Each object will represent a passenger who hasn't a membership
 * @author pasindu
 */
public class NonMember extends Passenger{

    /**
     *
     * @param name Name of the passenger
     * @param age Age of the passenger
     */
    public NonMember(String name, int age) {
        super(name, age);
    }
    /***
     * Calculates and returns the price of the ticket depending on the passenger's age 
     * @param p Original Price for the flight
     * @return  discounted price
     */
    @Override
    public double applyDiscount(double p){
        return getAge()>65 ? p*(90.0/100.0) : p;
    }
}
