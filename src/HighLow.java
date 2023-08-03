import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomNumber = new Random();
        boolean userStay;
        do {
            int newNumber = randomNumber.nextInt(50) + 1;
            System.out.println(newNumber);
            System.out.println("Guess a number 1-50 in 5 guesses");
            int guessCount = 0;
            do {
                int userInput = sc.nextInt();
                guessCount++;
                if (userInput == newNumber) {
                    System.out.println("GOOD GUESS! You got it in " + guessCount + " attempts");
                    break;
                } else if (userInput < newNumber) {
                    System.out.println("HIGHER");
                } else if (userInput >= 50){
                    System.out.println("Please enter a number in range");
                } else {
                    System.out.println("LOWER");
                }
                if (guessCount >= 5) {
                    System.out.println("I'm sorry your game is Over");
                    break;
                }
            } while (true);
            System.out.print("Continue? [y/N] ");
            String input = sc.next();
            userStay = input.equalsIgnoreCase("y");
        } while(userStay);
        System.out.println("Thanks for playing!");
    }
}
