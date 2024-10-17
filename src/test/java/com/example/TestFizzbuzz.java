package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TestFizzbuzz 
{

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

        assertEquals("FIZZ\r\n",Fizzbuzz.fizzBuzz(3));
    }

    @Test
    public void containsFive(){
        
        assertEquals("BUZZ\r\n", Fizzbuzz.fizzBuzz(5));
    }

    @Test
    public void testContieneDigito() {

        assertEquals(true, Fizzbuzz.digitContains(12345, 3));
        assertEquals(false, Fizzbuzz.digitContains(6789, 5));
        assertEquals(true, Fizzbuzz.digitContains(10123, 1));
        assertEquals(false, Fizzbuzz.digitContains(0, 5));
  
    }
    

    

}
