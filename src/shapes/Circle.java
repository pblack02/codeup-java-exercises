package shapes;

import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public static int ciclesMade = 0;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (PI * ((int)Math.pow(radius, 2)));
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }




}
