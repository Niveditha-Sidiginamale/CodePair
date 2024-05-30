package com.example.demo;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args){
        int number = 1000; // Input can be changed to any number, ex : 10 , 100 , 1000 etc
        BigInteger factorial = findFactorial(number);

        String trimmedValue = factorial.toString().substring(0,Math.min(factorial.toString().length(), 10));
        System.out.println("Factorial of input number "+ number + " is " + trimmedValue);
    }

    private static BigInteger findFactorial(int input) {

        if(input == 0 || input == 1)
            return BigInteger.valueOf(1);

         BigInteger in = BigInteger.valueOf(input);
        return in.multiply(findFactorial(input-1));
    }


}
