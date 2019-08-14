package com.Circle_EH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initial values set to negatives to trigger while loops for input
        int n = -1;
        int num = -1;
        int opposite;

        Scanner scanner = new Scanner(System.in);

        // Collect the n and number value, looping until they meet the requirements.
        while(n < 2 || n % 2 != 0) { // loops if n < 2 or non even.
            System.out.print("Please enter a value of n for the circle (must be even): ");
            n = scanner.nextInt();
            scanner.nextLine();
        }

        while(num < 0 || num > n-1) { // loops if not between 0..n-1
            System.out.format("Please enter a number between 0 and %d: ", n - 1);
            num = scanner.nextInt();
            scanner.nextLine();
        }

        Circle circle = new Circle(n);

        opposite = circle.radialOpposite(num);

        System.out.format("The radial opposite of number %d a circle size %d is: %d", num, n, opposite);

    }
}
