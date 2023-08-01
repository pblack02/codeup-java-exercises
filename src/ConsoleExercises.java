import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        String userInt = scanner.nextLine();
//        System.out.println(userInt);

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter three words ");
//        String userWordOne = scanner.next();
//        String userWordTwo = scanner.next();
//        String userWordThree = scanner.next();
//        System.out.println(userWordOne);
//        System.out.println(userWordTwo);
//        System.out.println(userWordThree);
//The system will not move on till it gets three words, if now it will only save the 3- will ignore the last token.

////the nextline will go until the line break
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Sentence");
//        String userInt = scanner.nextLine();
//        System.out.println(userInt);


//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        String userLengthInput = scanner.nextLine();
        int length = Integer.parseInt(userLengthInput);
        System.out.println("enter width");
        String userWidthInput = scanner.nextLine();
        int width = Integer.parseInt(userWidthInput);

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.printf("The area is %d, the perimeter is %s", area, perimeter);

    }
}
