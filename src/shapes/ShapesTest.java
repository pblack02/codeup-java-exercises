package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
//        Square box3 = new Square(5);
//        System.out.println(box3.getPerimeter());
//        System.out.println(box3.getArea());
        Measurable myShape;

         myShape = new Square(2);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

         myShape = new Rectangle(2,4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());




    }
}
