package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
//    protected long length;
//    protected long width;
//
//    public Rectangle (long length, long width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public long getArea(){
//        return this.length * this.width;
//    }
//
//    public long getPerimeter(){
//        return 2 * length + (2 * width);
//    }
}
