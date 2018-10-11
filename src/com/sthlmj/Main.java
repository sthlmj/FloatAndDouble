package com.sthlmj;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4bytes).
        int myIntValue = 5 / 2;
        // width of float = 32 (4 bytes).
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes).
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // challenge:
        // convert a given number of pounds to kilograms
        // 1. create a variable to store the number of pounds
        // 2. calculate the number of kilograms for the number above and store in a variable
        // 3. print out the results
        // notes: 1 pound is equal to 0.45359237 kg.

        // stores the pounds
        double myLbs = 200d;

        // calculate the number of pounds
        double lbsFactor = 0.45359237d;

        // print out the results
        double lbsConv = myLbs * lbsFactor;

        System.out.println(myLbs + "lbs  = " + lbsConv + " kgs");
    }
}
