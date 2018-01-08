/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 * Abstract Class to Represent both Members and NonMembers
 * @author pasindu
 */
public abstract class Passenger {
    
    private String name;
    private int age;

    /**
     *
     * @param name Name of the passenger
     * @param age Age of the passenger
     */
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     *
     * @param p Original price of the flight
     * @return discounted price
     */
    public abstract double applyDiscount(double p);
    
    /**
     *
     * @return Name of the passenger
     */
    public String getName(){
        return name;
    }
    
    /**
     *
     * @return Age of the passenger
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param name Name of the passenger
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param age Age of the passenger
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
