/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 * Abstract class for DigitCounter and LinkedDigitCounter
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public abstract class AbstractCounter implements Counter{

    /**
     * Represents the value of the digit
     * Can be access in DigitCounter and LinkedDigitCounter
     */
    protected int value;

    /**
     * Creating a digit equals to 0
     */
    public AbstractCounter() {
        this.value = 0;
    }
    
    /**
     * Set the value of the digit
     * @param value Value of the digit
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Returns the value of the digit
     * @return Value of the digit
     */
    public int getValue() {
        return value;
    }

    @Override
    public String count() {
        return ""+getValue();
    }

    @Override
    public void reset() {
        setValue(0);
    }
    
}
