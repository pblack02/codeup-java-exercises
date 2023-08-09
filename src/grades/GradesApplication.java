package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Bob = new Student("Bob");
        students.put("bob_club", Bob);
        Bob.addGrade(70);
        Bob.addGrade(80);
        Bob.addGrade(85);
        Student Presley = new Student("Presley");
        students.put("pblack2002", Presley);
        Presley.addGrade(80);
        Presley.addGrade(95);
        Presley.addGrade(97);
        Student Black = new Student("Black");
        students.put("blackp2002", Black);
        Black.addGrade(90);
        Black.addGrade(85);
        Black.addGrade(70);
        Student Alex = new Student("Alex");
        students.put("bobsplace", Alex);
        Alex.addGrade(85);
        Alex.addGrade(75);
        Alex.addGrade(90);

        Input input = new Input();
        do {
            System.out.println("Welcome!");
            System.out.println("Students Username: \n");
            for (Map.Entry<String, Student> entry : students.entrySet()) {
                System.out.printf(entry.getKey() + " |  ");
            }
            System.out.println("\n");
            System.out.println("What Student would you like info on? ");
            String userInput = input.getString();
            if (students.containsKey(userInput)){
                Student student = students.get(userInput);
                System.out.println("Name: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.printf("Grade Average is: %.2f \n", student.getGradeAverage());
            } else {
                System.out.println("Sorry, that student doesn't exist");
            }

            // Ask if the user wants to continue
            System.out.println("Do you want to look at another Student? (yes/no) ");

        } while (input.yesNo());

        System.out.println("Thank you for checking students!");





    }
}
