package com.Circle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         *
         *  Circle / opposite radial made during tutorial.
         */

        int n, number; // Declare the variables that will be set by our scanner

        Scanner scanner = new Scanner(System.in); // Instantiate a new scanner that accepts input from the System.in (console for the application)

        System.out.println("What size n for the circle? (must be even)");
        n = scanner.nextInt(); // collect next int entered into console and set to in

        System.out.println("What number do you want the opposite for?");
        number = scanner.nextInt(); // repeat for number

        Circle circle = new Circle(n); // Instantiate new circle object with n.

        int opposite = circle.radialOpposite(number); // calculate radial opposite of number for

        System.out.println(opposite); // print out result

    }
}
