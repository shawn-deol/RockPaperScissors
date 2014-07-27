/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Shawn
 * Rock,paper,scissors simulator
 * Nov 23
 * V.1.0
 */
public class RockPaperScissors {
    //Declare global variables
    public static int wins = 0;
    public static int losses = 0;
    public static int ties = 0;
    
//Function to generate computer's selection
    public static int randomRockPaperScissors() {
        //Generates choice for the computer and returns the value
        int computerSelection = (int) (Math.random() * 3) + 1;
        return computerSelection;
    }
//Function for determining the outcome of the match
    public static String determineOutcome(int userSelection, int computerSelection) {
        //Series of if statements and nested if statements to determines who wins between you and the computer
        if (userSelection == computerSelection) {
            System.out.println("You've both rolled the same!");
            ties++;
        } else if (userSelection == 1) {
            if (computerSelection == 2) {
                System.out.println("His paper covered your rock, you lose!");
                losses++;
            } else if (computerSelection == 3) {
                System.out.println("Your rock smashed his scissors! you win!");
                wins++;
            }
        } else if (userSelection == 2) {
            if (computerSelection == 1) {
                System.out.println("Your paper covered his rock, you win!");
                wins++;
            } else if (computerSelection == 3) {
                System.out.println("His scissors cut your paper, you lose!");
                losses++;
            }
        } else if (userSelection == 3) {
            if (computerSelection == 1) {
                System.out.println("His rock smashed your scissors, you lose!");
                losses++;
            } else if (computerSelection == 2) {
                System.out.println("Your scissors cut his paper, you win!");
                wins++;
            }
        }

        return "Wins: " + wins + " Ties: " + ties + " Losses: " + losses;
    }

    public static void main(String[] args) {
        //State variable and introduce scanner
        int userSelection;
        Scanner input = new Scanner(System.in);
        // Loop to ask for user input and run the functions
        for (int i = 1;; i++) {
            System.out.println("Please enter 1 for rock, 2 for paper or 3 for scissors");
            userSelection = input.nextInt();
            int computerSelection = randomRockPaperScissors();
            System.out.println(determineOutcome(userSelection, computerSelection));
        }

    }
}