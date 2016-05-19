package com.BorisV;

public class WithAssertion2 {

    public static void main(String[] args) {
        //Enable the assertion option before running this code.

        WithAssertion2 ast2 = new WithAssertion2();

        //I ran this code to see what was doing, the number is to large for an int.
        int sum = add(2100000000, 2100000000);
        System.out.println("Result of adding two numbers is " + sum + "\n");

    }

    public static int add(int a, int b) {
        //This part of the code is from the slides to test the assertion and works.
        assert ((Integer.MAX_VALUE - a)  >=   b) : " Sum of " + a + " + " + b + " created integer overflow";

        int result = a + b;

        return result;

    }

}
