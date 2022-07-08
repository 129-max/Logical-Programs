package com.example.bridgelabz;

public class FibonacciSeries {

    public static void main(String[] args) {
        Day6logical utility = new Day6logical();
        System.out.print("Enter the num to get fibonacci series up to n :");
        int n = utility.getIntValue();
        utility.getFibonacci(n);

    }
}
