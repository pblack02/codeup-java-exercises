import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s", pi);


        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        String userOne = scanner.nextLine();
        String userTwo = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.println("You entered: --> \"" + userOne + "\" <--");
        System.out.println("You entered: --> \"" + userTwo + "\" <--");

    }
}
