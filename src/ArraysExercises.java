import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person personToAdd){
       Person[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = personToAdd;
        return newArray;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
        Person[] people = {
                new Person("Bod"),
                new Person("Jill"),
                new Person("Presley")
        };

        for (Person person : people){
            System.out.println(person.getName());
        }


//        System.out.println(Arrays.toString(addPerson(people, )));
    }
}
