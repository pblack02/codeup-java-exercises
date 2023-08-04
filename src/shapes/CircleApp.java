package shapes;

import java.util.Scanner;

import static util.Input.yesNo;

public class CircleApp {

    public static void createCircle(){
        do {
            Circle myCircle = new Circle();
            Circle.ciclesMade++;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a radius in meters");
            double userNum = scan.nextDouble();
            myCircle.setRadius(userNum);
            System.out.printf("Your radius is %f%n", userNum);
            System.out.printf("Your area is %f%n",myCircle.getArea());
            System.out.printf("Your Circumference is %f%n", myCircle.getCircumference());
            System.out.printf("You've made %d circles %n", Circle.ciclesMade);
        } while (yesNo());
        System.out.printf("You've made %d circles %n", Circle.ciclesMade);
    }


    public static void main(String[] args) {
    createCircle();

    }



}
