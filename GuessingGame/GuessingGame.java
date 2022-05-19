package GuessingGame;

import java.util.Scanner; 

public class GuessingGame {

    public static void main(String[] args) {    // Driver Code
        guessingNumberGame();    // Function Call 
    }
    
    public static void guessingNumberGame() {     // Function that implements the number guessing game

        Scanner input = new Scanner(System.in);     // Scanner Class 

        int target = (int)(100 * Math.random());   // Generate the numbers 

        int i, guess, choice;

        System.out.println("A number between 1 and 100 has been chosen.");

        for (i = 0; i < 1000; i++) {     // Interate over K Trials 
            System.out.print("Guess the number or type 0 to quit: ");

            guess = input.nextInt();     // Take input for guessing 

            
            if (target == guess) {    // If the number is guessed 
                System.out.println("Congratulations!" + " You guessed the number in " + i + " trials.");
                break;
            } else if (guess == 0) {
                System.out.print("You quit! \"Guess\" 1 to try again or any other number to quit for real: ");
                choice = input.nextInt();
                if (choice == 1) {
                    continue;
                } else {
                    break;
                }
            } else if (target > guess) {
                System.out.println("The number is " + "greater than " + guess + ". Try again!");
            } else if (target < guess) {
                System.out.println("The number is" + " less than " + guess + ". Try again!");
            }
        }
        System.out.println("You did great!");
    }
}