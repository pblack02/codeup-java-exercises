package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        System.out.println("Enter Somethin");
        String string = scanner.nextLine();
        return string;
    }

    public static boolean yesNo() {
        System.out.println("Would you like to continue?");
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes") | userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        do {
            int userInput = scanner.nextInt();
            if (userInput > min && userInput < max) {
                System.out.println(userInput);
            } else {
                System.out.println("Please enter a correct value.");
            }
            return userInput;
        } while (true);
    }

    public static int getInt() {
        System.out.println("Pick and int!");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max);
        double userInput = scanner.nextDouble();
        do {
            if (userInput > min && userInput < max) {
                System.out.println(userInput);
            } else {
                System.out.println("Please enter a correct value.");
            }
            return userInput;
        } while (true);
    }


    public static double getDouble() {
        System.out.println("Pick a double");
        double userInput = scanner.nextDouble();
        return userInput;
    }


}

