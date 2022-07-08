package com.example.bridgelabz;

public class Coupons {

    public static void main(String[] args) {
        Day6logical utility = new Day6logical();
        System.out.print("Enter number of coupons to generat n: " );
        int numberOfCoupns = utility.getIntValue();
        System.out.print("Enter Size of coupons: " );
        int sizeOfCoupon = utility.getIntValue();
        Day6logical.getCoupons(numberOfCoupns,sizeOfCoupon);

    }
}
