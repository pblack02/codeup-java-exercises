package shapes;



public class Square extends Rectangle{
    public Square(int side) {
       super(side, side);
    }

    public long getArea(int side){
        return side ^ 2;
    }
    public long getPerimeter(int side){
        return 4 * side;
    }

}
