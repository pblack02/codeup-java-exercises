package shapes;

import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public static int ciclesMade = 0;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
       double area = (PI * ((int)Math.pow(radius, 2)));
        return area;
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }




}
