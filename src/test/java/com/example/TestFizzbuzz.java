package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TestFizzbuzz {

    @Test
    public void Divisible3(){
        
        assertEquals("FIZZ", Fizzbuzz.fizzBuzz(9));
    }

    @Test
    public void Divisible5(){
        
        assertEquals("BUZZ", Fizzbuzz.fizzBuzz(10));
    }

    @Test
    public void Divisible3and5(){
        
        assertEquals("FIZZBUZZ", Fizzbuzz.fizzBuzz(15));
    }

    @Test
    public void DivisibleNothing(){
        
        assertEquals("NADA", Fizzbuzz.fizzBuzz(2));
    }
    
    @Test
    public void containsThree(){

        assertEquals("FIZZ",Fizzbuzz.fizzBuzz(3));
    }

    @Test
    public void containsFive(){
        
        assertEquals("BUZZ", Fizzbuzz.fizzBuzz(5));
    }

    @Test
    public void containsThreeNotDivisible() {
        assertEquals("FIZZ", Fizzbuzz.fizzBuzz(13));
    }

    @Test
    public void containsFiveNotDivisible() {
        assertEquals("BUZZ", Fizzbuzz.fizzBuzz(52));
    }

    @Test
    public void edgeCaseZero() {
        assertEquals("FIZZBUZZ", Fizzbuzz.fizzBuzz(0));
    }

    @Test
    public void negativeNumber() {
        assertEquals("NADA", Fizzbuzz.fizzBuzz(-1));
    }
    
    @Test
    public void containsThreeAndFive() {
        assertEquals("FIZZ", Fizzbuzz.fizzBuzz(53));
    }

    @Test
    public void testContieneDigito() {

        assertEquals(true, Fizzbuzz.digitContains(12345, 3));
        assertEquals(false, Fizzbuzz.digitContains(6789, 5));
        assertEquals(true, Fizzbuzz.digitContains(10123, 1));
        assertEquals(false, Fizzbuzz.digitContains(0, 5));
    }
    

}
