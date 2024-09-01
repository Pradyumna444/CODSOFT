import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int lowerBound = 1;
            int upperBound = 100;
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int maxAttempts = 10;
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("\nI'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    hasWon = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (hasWon) {
                System.out.println("\nCongratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
            } else {
                System.out.println("\nSorry, you've run out of attempts. The number was " + numberToGuess + ".");
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            scanner.nextLine();  // Consume the newline character
            String response = scanner.nextLine();

            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();
    }
}
