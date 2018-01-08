/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 * Represents an odometer for any given number of digits
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class Odometer implements Counter{
    private final Counter[] digits;
    private final int numofDigits;

    /**
     * Create an odometer for any given number of digits
     * @param numofDigits number of digits in the odometer
     * @throws IllegalArgumentException
     */
    //Requires: Number of digits has to be equals or more than 1
    //Modifies: None
    //Effects:  Create an odometer for any given number of digits
    public Odometer(int numofDigits) throws IllegalArgumentException {
        if(numofDigits<=0){
            throw new IllegalArgumentException();
        }
        this.numofDigits=numofDigits;
        this.digits = new Counter[numofDigits];
        this.digits[0]=new DigitCounter();
        for (int i = 1; i < numofDigits; i++) {
            this.digits[i]=new LinkedDigitCounter(this.digits[i-1]);
        }
    }

    /**
     * Returns the number of digits in the odometer
     * @return number of digits in the odometer
     */
    public int getNumofDigits() {
        return numofDigits;
    }
    
    
    
    
    @Override
    public String count() {
        String count="";
        for (int i = 0; i < numofDigits; i++) {
            count+=digits[i].count();
        }
        return count;
    }

    @Override
    public void increment() {
        digits[numofDigits-1].increment();
    }

    @Override
    public void decrement() {
        digits[numofDigits-1].decrement();
    }

    @Override
    public void reset() {
        for (int i = 0; i < numofDigits; i++) {
            digits[i].reset();
        }
    }
    
}
