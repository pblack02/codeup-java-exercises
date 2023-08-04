package shapes;

import static java.lang.Math.PI;

public class Circle {
    double radius;

    public double getArea(){
       double area = (PI * ((int)Math.pow(radius, 2)));
        return area;
    }

    public double getCircumference(){
        double circumference = 2 * PI * radius;
        return circumference;
    }




}
