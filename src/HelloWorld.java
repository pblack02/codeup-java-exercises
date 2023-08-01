public class HelloWorld {
    public static void main(String[] args) {
//        how we 'log' to the console
//        to output information to the console with a newline
        System.out.println("Hello, World!");
//        to output information without a newline
        System.out.print("Hello, World!");

        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);

        String myString = "hello";
        System.out.println(myString);

//        float myNumber = 3.14;
//
//        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        System.out.println(theNumberThree);
        Object o = theNumberThree;
        System.out.println(o);
        int three = (int) o;
//a string can not be cast as an int
        System.out.println(three);






    }
}
