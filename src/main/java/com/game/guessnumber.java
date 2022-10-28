package com.game;

import java.util.Random;
import java.util.Scanner;

//This is the game as a one 

public class guessnumber {
    private static final  Random r=new Random();
    private static final int NUMBER= r.nextInt(100)+1;
    private static int guess=0;                   
    public static void main(String[] args) {
        Scanner player= new Scanner(System.in);
        // System.out.println("number is "+ String.valueOf(NUMBER));
        int guesses=0;


        while (guess !=NUMBER){
            System.out.println("Guess a number between a 1 and 100");
            guess=player.nextInt();
            guesses++;

            if (guess < NUMBER){
                System.out.println("Too low, go higher!");
                
            }else if (guess > NUMBER){
                System.out.println("Too high, go lower!");
                
            }else{
                System.out.println("That is correct. It took "+guesses+" guesses to get the correct number. Good job!");
                player.close();
                System.exit(0);
            }
        }
    }
        
}
