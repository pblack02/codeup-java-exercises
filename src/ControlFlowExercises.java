import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

//        while loop

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        for loop

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

////        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line
//        while loop

//        int i = 0;
//        do {
//            System.out.println(i);
//              i += 2;
//        } while (i <= 100);

//        for loop
//        for (int i =0; i <= 100; i += 2) {
//            System.out.println(i);
//        }


//        Alter your loop to count backwards by 5's from 100 to -10.
//       do- while loop
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        while loop
//        int i = 100;
//        while (i >= -10){
//            System.out.println(i);
//            i -= 5;
//        }

//        for loop
//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }



//               Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000


//        Fizzbuzz

//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 0-100");
        int userInput = Integer.parseInt(scanner.next());
        if (userInput < 59){
            System.out.println("F");
        } else if (userInput < 66){
            System.out.println("D");
        } else if (userInput < 79){
            System.out.println("C");
        } else if (userInput < 87) {
            System.out.println("B");
        } else if (userInput <= 100){
            System.out.println("A");
        } else {
            System.out.println("Please enter a valid input");
        }





    }
}
