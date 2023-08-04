import java.util.Scanner;
import java.util.Random;


public class MethodsExercises {
//    Create four separate methods. Each will perform an arithmetic operation


    public static int addition(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static double addition(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static int subtraction(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int divide(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    public static int modules(int numberOne, int numberTwo) {
        return numberOne % numberTwo;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("Invalid input. Please enter a number.");
            }
            userInput = scanner.nextInt();
            if (userInput < min || userInput > max) {
                System.out.println("Please enter a number within the correct range.");
            }
        } while (userInput < min || userInput > max);
        System.out.println(userInput);
        return userInput;
    }


    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does the dice have?");
        int sides = scanner.nextInt();
        Random randomNumber = new Random();
        do {
            System.out.println("Roll the dice (type 'roll')");
            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase("roll")) {
                int newNumber = randomNumber.nextInt(sides) + 1;
                System.out.println("The number on the dice is " + newNumber);
            } else {
                System.out.println("Invalid input. Type 'roll' to roll the dice or 'exit' to quit.");
            }
        } while (true);
    }


    public static void main(String[] args) {
//        System.out.println(addition(3, 2));
//        System.out.println(addition(14, 27));
//        System.out.println(subtraction(3,2));
//        System.out.println(multiply(3,2));
//        System.out.println(divide(10,2));
//        System.out.println(modules(50,10));

        int userInput = getInteger(1, 10);
//        rollDice();



    }
}
