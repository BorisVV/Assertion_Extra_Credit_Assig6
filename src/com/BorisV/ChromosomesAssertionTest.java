package com.BorisV;

import java.util.HashMap;
import java.util.Set;

public class ChromosomesAssertionTest {

    public static void main(String[] args) {
        //Enable the assertion option before running this code.

        //Biology program
        //Tracks the number of chromosomes an animal has
        //Chromosomes come in pairs so total is always an even number
        HashMap totalchromosomes = new HashMap();
        totalchromosomes.put("Human", -46); //This was changed to a negative number to test the assertion.
        totalchromosomes.put("Squirrel", 80);
        totalchromosomes.put("Hedgehog", 88);
        totalchromosomes.put("Frog", 25); // This was changed to an odd number to also check the assertion test.
        totalchromosomes.put("Giant Squid", 48);

        //all data according to the internet....
        Set allAnimalNames = totalchromosomes.keySet();
        for (Object a : allAnimalNames) {
            int chrom = (int) totalchromosomes.get(a);
            int pairs = chrom / 2;
//            assert (pairs >= 0) : "Negative number";  // this is to test if a chromosomes number is negative.
            assert (chrom % 2 == 0) : "Odd number";  //this is to test is the total chromosomes ends in Odd numbers
            System.out.println("A " + a + " has " + pairs + " pairs of chromosomes, so " + chrom + " in total");
        }
    }
}
