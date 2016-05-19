package com.BorisV;

public class NoAssertion {

    public static void main(String[] args) {

        //This is to test a boolean that has no assertion test.
        System.out.println("Boolean without assertion");
        NoAssertion ast = new NoAssertion();
        System.out.println("The answer is true or false only '" + ast.approveAge(70) + "'");
        System.out.println("The answer is true or false only '" + ast.approveAge(350) + "'");

    }

    //Boolean without assertion
    boolean approveAge(int age) {
        if (age > 60 && age < 110) {
            return true; //the code runs without an error
        } else {        //The answer will always be just true or false.
            return false;
        }
    }

}
