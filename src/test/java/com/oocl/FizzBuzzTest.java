package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_number_when_input_number_is_normal(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(1);

        //then
        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_when_input_number_is_dividable_by_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(3);

        //then
        Assert.assertEquals("Fizz", result);
    }

}
