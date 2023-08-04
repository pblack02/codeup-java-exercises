package shapes;

import static java.lang.Math.PI;

public class Circle {
    double radius;
    public static int ciclesMade = 0;

    public double getArea(){
       double area = (PI * ((int)Math.pow(radius, 2)));
        return area;
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }




}
