package com.Game;

public class Main {

    public static void main(String[] args) {

        // Entry point for the game

        Game game = new Game(5); // instantiate new game with n rounds. (Choose odd number to allow for "best of n")
        game.playGame(); // run the game

    }
}
