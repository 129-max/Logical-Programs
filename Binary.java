package com.example.bridgelabz;

public class Binary {
    public static void main(String[] args) {
        Day6logical utility = new Day6logical();
        System.out.print("Enter the number: ");
        int number = utility.getIntValue();
        int newNumber = Day6logical.swapNibbles(number);
        System.out.println("After swapping nibbles new numbers = "+newNumber);
        Day6logical.isPowerOfTwo(newNumber);


    }

}
