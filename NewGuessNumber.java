import java.util.*;

public class NewGuessNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Number Guessing Game");

        while (true) {

            int compGuess = rand.nextInt(100) + 1;
            int attempt = 0;

            while (true) {

                System.out.println("Guess a number between 1 to 100");
                int userGuess = sc.nextInt();

                attempt++;

                if (userGuess == compGuess) {
                    System.out.println("Congrats! You guessed the number in " + attempt + " attempts");
                    break;

                } else if (userGuess > compGuess) {
                    System.out.println("Number is smaller");

                } else {
                    System.out.println("Number is greater");
                }
            }

            System.out.println("\nGame Over");
            System.out.println("Enter 1 to play again");
            System.out.println("Enter 0 to quit");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Thanks for playing");
                break;

            } else if (choice == 1) {
                System.out.println("\nNew Game Starts...\n");

            } else {
                System.out.println("Invalid choice");
                System.out.println("Game closed");
                break;
            }
        }

        sc.close();
    }
}