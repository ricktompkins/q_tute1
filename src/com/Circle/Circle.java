package com.Circle;

public class Circle {

    final private int N;

    /**
     * Constructor for Circle accepts the n which is its size (assumed to be a positive number).
     * @param n
     */

    public Circle(int n) {
        N = n;
    }

    /**
     * Radial opposite method that accepts a number assumed to be between 0..n-1 and returns the number in the opposite position on the circl.e
     * @param num
     * @return radial opposite (int)
     */

    public int radialOpposite(int num) {

        // Checks if number input is in the lower half of the values, if so it calculates using addition
        // otherwise uses subtraction.

        if(num <= N/2) {
            return num + N/2;
        }
        return num - N/2;

    }
}
