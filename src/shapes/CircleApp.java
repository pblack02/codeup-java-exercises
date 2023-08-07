package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void createCircle(){
        Input input = new Input();
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a radius in meters");
            double radius = scan.nextDouble();
            Circle myCircle = new Circle(radius);
            Circle.ciclesMade++;
            System.out.printf("Your radius is %.2f%n", radius);
            System.out.printf("Your area is %.2f%n",myCircle.getArea());
            System.out.printf("Your Circumference is %.2f%n", myCircle.getCircumference());
            System.out.printf("You've made %d circles %n", Circle.ciclesMade);
        } while (input.yesNo());
        System.out.printf("You've made %d circles %n", Circle.ciclesMade);
    }



    public static void main(String[] args) {
    createCircle();

    }



}
