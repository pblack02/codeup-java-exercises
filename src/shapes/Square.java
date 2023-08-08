package shapes;



public class Square extends Quadrilateral{
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }
//    public Square(int side) {
//       super(side, side);
//    }
//
//
//    public long getArea() {
//        return super.getArea();
//    }
//
//    public long getPerimeter(){
//        return super.getPerimeter();
//    }

}
