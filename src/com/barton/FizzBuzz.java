package com.barton;

public class FizzBuzz {

    public static String getResult(int number) {
        if(number % 15 == 0) return "FizzBuzz";
        else if (number % 3 ==0) return "fizz";
        else if (number % 5 == 0) return "buzz";

        return Integer.toString(number);

        /**
         * If a number is divisible by three one says Fizz
         *
         * if divisible by five Buzz
         *
         * if divisible by 3 and 5 it is FizzBuzz
         *
         * Exactly what the logic does above
         *
         * Then return the number to string
         */


    }
}

