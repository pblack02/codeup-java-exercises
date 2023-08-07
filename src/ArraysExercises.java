import java.util.Arrays;

public class ArraysExercises {

//    public static Person addPerson(Person[] array, Person person){
//
//    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person[] people = new Person[3];
        people[0].setName("Presley");
        people[1].setName("John");
        people[2].setName("Bob");
        for (int i = 0; i < people.length; i +=1){
            people[i] = new Person();
            System.out.println(Person.getName());
        }
        System.out.println(Arrays.toString(numbers));
    }
}
