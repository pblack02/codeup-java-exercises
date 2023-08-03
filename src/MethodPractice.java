public class MethodPractice {
//    TODO: Write a method, returnName, that returns the string of your name.
    public static String returnName(){
        return "Presley Black";
    }
// TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.
    public static String returnLongerString (String one, String two){
        if (one.length() > two.length()){
            return one;
        } else {
            return two;
        }
    }
//    TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
public static Boolean canBeHalved (int num){
        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
}

    public static void main(String[] args) {
        System.out.println(returnName());
        System.out.println(returnLongerString("cat", "justin"));
        System.out.println(canBeHalved(21));
    }
}
