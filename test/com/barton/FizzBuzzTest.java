package com.barton;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    /**
     * Below is asking does fizz equal 3
     */
    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        Assert.assertEquals("fizz", FizzBuzz.getResult(3));
        Assert.assertEquals("fizz", FizzBuzz.getResult(6));
        Assert.assertEquals("fizz", FizzBuzz.getResult(9));
        Assert.assertEquals("fizz", FizzBuzz.getResult(12));

    }

    /**
     * Assert that multiples of five equal Buzz
     */
    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        Assert.assertEquals("buzz", FizzBuzz.getResult(5));
        Assert.assertEquals("buzz", FizzBuzz.getResult(10));
    }

    /**
     * Is it divisible by both three and five
     */
    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.getResult(15));
        //Assert.assertEquals("FizzBuzz", FizzBuzz.getResult(25));
    }

    /**
     * All other numbers are the same
     */
    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzBuzz.getResult(1));
        Assert.assertEquals("2", FizzBuzz.getResult(2));
        Assert.assertEquals("4", FizzBuzz.getResult(4));
        Assert.assertEquals("7", FizzBuzz.getResult(7));
        Assert.assertEquals("8", FizzBuzz.getResult(8));
        Assert.assertEquals("11", FizzBuzz.getResult(11));




    }

}
