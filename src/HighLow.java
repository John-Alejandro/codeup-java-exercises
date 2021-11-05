import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my guessing game!");
        int myNumber = (int) Math.floor(Math.random() * 100);
        int userInput;

        System.out.println("Guess my number!");

        do {
            System.out.println("Choose a number between 1-100:");
            userInput = scanner.nextInt();

            if (userInput > myNumber) {
                System.out.println("LOWER");
            } else if (userInput < myNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("GOOD GUESS");
            }
        } while (userInput != myNumber);
    }
}