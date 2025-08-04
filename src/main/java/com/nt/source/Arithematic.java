package com.nt.source;

public class Arithematic {
    public int add(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        Arithematic arithematic= new Arithematic();
        System.out.println("Sum is ::"+arithematic.add(12,13));
    }
}
// here today we want to test through the unit testing not throuhg the main method and we will write the possible test cases like addition with the positive number addition with negative number addition with the mixed number addition with zero