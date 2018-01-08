/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 * Represents the digits of the odometer except the very left digit of the odometer
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class LinkedDigitCounter extends AbstractCounter{
    /***
     * The next digit to the left
     */
    private Counter leftNeighbor;

    /**
     * Create a linked digit while assigning its left neighbor
     * @param leftNeighbor next digit to the left
     */
    public LinkedDigitCounter(Counter leftNeighbor) {
        this.leftNeighbor = leftNeighbor;
    }

    /**
     * Return the next digit to the left
     * @return next digit to the left
     */
    public Counter getLeftNeighbor() {
        return leftNeighbor;
    }

    /**
     * Set the next digit to the left
     * @param leftNeighbor next digit to the left
     */
    public void setLeftNeighbor(Counter leftNeighbor) {
        this.leftNeighbor = leftNeighbor;
    }

    @Override
    public void increment() {
        if(this.value<9){
            this.value++;
        }else{
            this.value=0;
            this.leftNeighbor.increment();
        }
    }

    @Override
    public void decrement() {
        if(this.value>0){
            this.value--;
        }else{
            this.value=9;
            this.leftNeighbor.decrement();
        }
    }
    
    
    
    
}
