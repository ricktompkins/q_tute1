package com.Game;

import java.util.Random;
import java.util.Scanner;


public class Game {

    final private int NUM_ROUNDS;
    private int player1, player2;
    private String computerChoice;
    private Random rand;
    private Scanner scanner;
    private String choice;

    public Game(int num_rounds) {

        NUM_ROUNDS = num_rounds;

        rand = new Random();
        player1 = player2 = 0;
        scanner = new Scanner(System.in);
    }

    /**
     * playGame() function commences the game, playing a "best of" the number of rounds set in the game's constructor.
     * The player continues to select a move and the game outputs the result based on what the computer plays.
     * Once either the player or the computer wins the best off, it returns the output.
     */

    public void playGame() {

        // game continues until one of the players has a winning number of the "best of"
        while (player1 < NUM_ROUNDS / 2 + 1 && player2 < NUM_ROUNDS / 2 + 1) {

            System.out.println("What move do you pick?");
            choice = scanner.nextLine();

            updateComputer(); // selects the computer's move.

            if (choice.equalsIgnoreCase(computerChoice)) { // if both moves are the same, no check needed and the round is a draw.
                System.out.format("You chose: %s, and the computer chose: %s. This round's a draw!\n", choice, computerChoice);
            } else {

                switch (choice.toLowerCase()) { // if not a draw, a simple switch statement decides who should receive the point.

                    case "scissors":
                        if(computerChoice == "Rock") {
                            player2++;
                        } else {
                            player1++;
                        }
                        break;

                    case "rock":
                        if(computerChoice == "Scissors") {
                            player1++;
                        } else {
                            player2++;
                        }
                        break;

                    case "paper":
                        if(computerChoice == "Scissors") {
                            player2++;
                        } else {
                            player1++;
                        }
                        break;
                }
                System.out.format("You picked: %s, the computer picked: %s. The scores are %d-%d\n", choice, computerChoice, player1, player2);
            }

        }

        System.out.format("Final score is you: %d, computer: %d\n", player1, player2);
        if(player1 > player2) {
            System.out.println("You win!");
        } else {
            System.out.println("The computer has won.");
        }
    }

    /**
     * updateComputer() function uses the Java random object to generate an integer between 0-2.
     * This random number then is simply used to select which move the computer makes using a switch statement.
     */

    private void updateComputer() {

        int choice = rand.nextInt(3);
        switch(choice) {
            case 0 :
                computerChoice = "Rock";
                break;
            case 1:
                computerChoice = "Paper";
                break;
            case 2:
                computerChoice = "Scissors";
                break;
        }

    }

}
