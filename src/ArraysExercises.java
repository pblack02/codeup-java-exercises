import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        int[] person = new int[3];
        for (int i = 0; i < person.length; i +=1){
            Person person4 = new Person();
            System.out.println(person[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
