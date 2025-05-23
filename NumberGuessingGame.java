import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100: ");
        while (true) {
            guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("Correct! You guessed it.");
                break;
            } else if (guess < number) System.out.println("Too low! Try again.");
            else System.out.println("Too high! Try again.");
        }

        scanner.close();
    }
}

