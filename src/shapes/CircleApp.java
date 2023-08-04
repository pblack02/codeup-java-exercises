package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius in meters");
        double userNum = scan.nextDouble();
        myCircle.radius = userNum;
        System.out.printf("Your radius is %f%n", userNum);
        System.out.printf("Your area is %f%n",myCircle.getArea());
        System.out.printf("Your Circumference is %f", myCircle.getCircumference());


    }


}
