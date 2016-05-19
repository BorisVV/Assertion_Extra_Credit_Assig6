package com.BorisV;


public class WithAssertion {

    public static void main(String[] args) {
        WithAssertion ast = new WithAssertion();
        //Enable the assertion option before running this code.

        //This is an assertion test code and the compiler will throw an error if the numbers don't match.
        //You should see an error message.
        System.out.println("\nThis code is a test");
        System.out.println(ast.approveAgeAssert(350));
        System.out.println("If the print out is true, without an error message, check or enable assertion");

    }

    //Boolean with assertion
    boolean approveAgeAssert(int age) {
        assert (age > 60 && age < 110) : "Age does not make sense";
        if (age > 60) {   //This make the compiler to throw an error when the number
            return true;    //is above 110
        } else {
            return false;
        }
    }


}
