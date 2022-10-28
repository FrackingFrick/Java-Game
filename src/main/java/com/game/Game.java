package com.game;

public class Game {
    Integer NUMBER = 0;
    Integer guesses = 0;

    public void chosenNumber() {
        NUMBER = 1 + (int) (100 * Math.random());
    }

    public String newGame() {
        return "Let's play a game!";
    }

    public String gameLogic(int guess) {
        while (guess != NUMBER) {
            guesses++;
            if (guess < NUMBER) {
                return "Too low, go higher!";

            } else if (guess > NUMBER) {
                return "Too high, go lower!";

            }else if (guess==NUMBER){
                System.exit(0);
            }

        }
        return "That is correct. It took " + guesses + " guesses to get the correct number. Good job!";

    }

}