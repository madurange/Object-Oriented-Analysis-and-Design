/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 * Each Object will represent a passenger who has a membership
 * @author pasindu
 */
public class Member extends Passenger {
    private int yearsOfMembership;

    /**
     *
     * @param yearsOfMembership Number of years of the membership
     * @param name Name of the passenger
     * @param age Age of the passenger
     */
    public Member(int yearsOfMembership, String name, int age) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    /**
     *
     * @return Number of years of the membership
     */
    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    /**
     *
     * @param yearsOfMembership Number of years of the membership
     */
    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }
    
    /**
     * Calculates and returns the ticket price depending on passenger's membership duration
     * @param p original price of the flight
     * @return discounted price
     */
    @Override
    public double applyDiscount(double p){
        if (getYearsOfMembership()>5) {
            return p*(50.0/100.0);
        }else if(getYearsOfMembership()>1){
            return p*(90.0/100.0);
        }else{
            return p;
        }
    }
    
}
