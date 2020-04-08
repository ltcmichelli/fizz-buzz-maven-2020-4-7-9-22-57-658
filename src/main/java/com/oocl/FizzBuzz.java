package com.oocl;

public class FizzBuzz {
    public String say(int input) {
        String result = "";

        if (input % 3 == 0) {
            result += "Fizz";
        }
        if (input % 5 == 0) {
            result += "Buzz";
        }

        return result.equals("") ? String.valueOf(input) : result;
    }
}
