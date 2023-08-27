import java.util.Random;

public class ExceptionExercises {

    public static int divideNums (int num1, int num2){
        try{
            return num1 / num2;
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by 0!");
            return 0;
        }
    }

    public static void delayedHello(int num){
        try{
            Thread.sleep(num);
            System.out.println("hello");
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }

    public static void displayString(String input){
        Random random = new Random();
        int minDelay = 50;  // Minimum delay in milliseconds
        int maxDelay = 150; // Maximum delay in milliseconds
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            int delay = random.nextInt(maxDelay - minDelay + 1) + minDelay;
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(divideNums(5, 0));
        delayedHello(500);
        displayString("Hello, how are you today?");
    }



}
