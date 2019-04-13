package com.benjaminbroad;

public class Main {

    public static void main(String[] args) {
	    // Underscores can visually act like commas for larger numbers
        // Width of 32
        int myMinimumIntValue = -2_147_483_648;
        int myMaxmimIntValue = 2_147_483_647;

        // Width of 8
        byte mySmallestByteValue = -128;
        byte myLargestByteValue = 127;
        // This is called casting, and can be used to get around the fact that Java will convert numeric *expressions* into int types
        byte myNewByteValue = (byte) (mySmallestByteValue/2);
        System.out.println(myNewByteValue);

        // Width of 16
        short mySmallestShortValue = -32_768;
        short myLargestShortValue = 32_767;

        // Width of 64
        long mySmallestLongValue = -9_223_372_036_854_775_808L;
        long myLargestLongValue = 9_223_372_036_854_775_807L;



        // Practice
        byte test1 = 127;
        byte test2 = -128;

        short test3 = 32_767;
        short test4 = -32_768;

        int test5 = 2_147_483_647;
        int test6 = -2_147_483_647;

        long result = (50_000 + (10 * test1) + test3 + test5);
        System.out.println(result);

    }
}
