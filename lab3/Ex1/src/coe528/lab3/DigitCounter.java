/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 * Represents the very left digit of the odometer OR the only digit of 1 digit odometer
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class DigitCounter extends AbstractCounter{

    @Override
    public void increment() {
        if(this.value<9){
            this.value++;
        }else{
            this.value=0;
        }
    }

    @Override
    public void decrement() {
        if(this.value>0){
            this.value--;
        }else{
            this.value=9;
        }
    }
    
}
