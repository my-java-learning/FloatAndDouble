package com.example;

public class Main {

    public static void main(String[] args) {
        //width of 32 (4 bytes)
        int myIntValue = 5 / 3;
        //width of 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //width of 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //exercise
        double poundsNumber = 200d;
        double kilogramsNumber = poundsNumber * 0.453_592_37d;
        System.out.println("Kilograms : " + kilogramsNumber);
    }
}
