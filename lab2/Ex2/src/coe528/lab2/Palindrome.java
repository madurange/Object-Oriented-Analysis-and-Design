/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab2;


/**
 * Finds whether the given string is Palindrome or not.
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class Palindrome {
    
    /***
     * Return true if the given string is Palindrome otherwise returns false
     * @param a String needs to be checked
     * @return true if the given string is Palindrome otherwise returns false
     */
    //Requires: String has to be non-null
    //Modifies: None
    //Effects:  Return true if the given string is Palindrome otherwise returns false.
    public static boolean isPalindrome(String a){
        if(a==null || a.trim().equals("")) return false;
        char[] temp=a.trim().toCharArray();
        for(int i=0;i<temp.length/2;i++){
            if(temp[i]!=temp[temp.length-1-i]){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
        if(args.length == 1) {
            if (args[0].equals("1"))
                System.out.println(isPalindrome(null));
            else if (args[0].equals("2")) 
                System.out.println(isPalindrome(""));
            else if (args[0].equals("3")) 
                System.out.println(isPalindrome("deed"));
            else if (args[0].equals("4"))
                System.out.println(isPalindrome("abcd"));
        }
    }
}
