package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    //constructor
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        String string = this.scanner.nextLine();
        return string;
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue?");
        String userInput = this.scanner.next();
        if (userInput.equalsIgnoreCase("yes") | userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt = this.getInt();
        if (userInt >= min && userInt <= max){
            return userInt;
        } else {
            System.out.printf("The number must be between %d and %d. Please try again.", min, max);
            return getInt(min, max);
        }
    }

    public int getInt() {
       try {
           return Integer.parseInt(this.getString());
       } catch (NumberFormatException e){
           System.out.println("You must enter a whole number");
           return Integer.parseInt(this.getString());
       }
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max);
        double userInput = this.scanner.nextDouble();
        do {
            if (userInput > min && userInput < max) {
                System.out.println(userInput);
            } else {
                System.out.println("Please enter a correct value.");
            }
            return userInput;
        } while (true);
    }


    public double getDouble() {
        try{
            return Double.parseDouble(this.getString());
        } catch (NumberFormatException e){
            System.out.println("You must enter a decimal number");
            return Double.parseDouble(this.getString());
        }
    }

    public int getBinary (){
        try{
            return Integer.parseInt(getString(), 2);
        } catch (NumberFormatException e){
            System.out.println("Please enter a binary");
            return Integer.parseInt(getString(), 2);
        }
    }

    public int getHex (){
        try{
            return Integer.parseInt(getString(), 16);
        } catch (NumberFormatException e){
            System.out.println("Please enter a hexadecimal");
            return Integer.parseInt(getString(), 16);
        }
    }

}

