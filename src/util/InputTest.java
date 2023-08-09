package util;

public class InputTest {
    public static void main(String[] args) {
        Input newInput = new Input();
//        System.out.println("enter a sting");
//        System.out.println(newInput.getString());
//        System.out.println(newInput.yesNo());
//        System.out.println("enter a number 1-10");
//        System.out.println(newInput.getInt(1, 10));
//        System.out.println("enter a whole number");
//        System.out.println(newInput.getInt());
//        System.out.println(newInput.getDouble(1.5, 10.5));
//        System.out.println("enter a decimal number");
//        System.out.println(newInput.getDouble());
        System.out.println("enter a Binary number");
        System.out.println(newInput.getBinary());
        System.out.println("enter a hexadecimal number");
        System.out.println(newInput.getHex());
    }

}

