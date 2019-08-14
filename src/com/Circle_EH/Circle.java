package com.Circle_EH;

public class Circle {

    final private int N;

    public Circle(int n) {

        N = n;
    }

    public int radialOpposite(int number) {

        if(number > N / 2) {
            return number - N / 2;
        }
        return number + N / 2;
    }

}
