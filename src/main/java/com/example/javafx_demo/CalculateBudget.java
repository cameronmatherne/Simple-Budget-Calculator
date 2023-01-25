package com.example.javafx_demo;

public class CalculateBudget {

    static public void calculate(double earnings) {
        double partitionOne;
        double partitionTwo;
        double partitionThree;

        partitionOne = earnings * .50;
        partitionTwo = earnings * .20;
        partitionThree = earnings * .10;

        String stringOne = "Money towards bills: " + partitionOne;
        String stringTwo = "Money towards savings: " + partitionTwo;
        String stringThree = "Money towards personal use: " + partitionThree;



    }
}
