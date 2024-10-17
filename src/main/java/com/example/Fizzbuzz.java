package com.example;

public class Fizzbuzz {

    public static boolean digitContains(int num, int digit){
        String numberAsString = String.valueOf(num);
        String digitAsString = String.valueOf(digit);

        return numberAsString.contains(digitAsString);
    
    }

    public static String fizzBuzz(int num) {

        boolean containsThree = digitContains(num, 3);
        boolean containsFive = digitContains(num, 5);
        if (num % 3 == 0 && num % 5 == 0) {
            
            return "FIZZBUZZ";

        } else if (num % 3 == 0 || containsThree) {
            
            return "FIZZ";
        
        } else if (num % 5 == 0 || containsFive) {
        
            return "BUZZ";
        
        } else {
        
            return "NADA";
        
        }
    
    }

}