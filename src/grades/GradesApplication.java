package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Bob = new Student("Bob");
        students.put("bob_club", new Student("Bob"));
        Bob.addGrade(70);
        Bob.addGrade(80);
        Bob.addGrade(85);
        Student Presley = new Student("Presley");
        students.put("pblack2002", new Student("Presley"));
        Presley.addGrade(80);
        Presley.addGrade(95);
        Presley.addGrade(97);
        Student Black = new Student("Black");
        students.put("blackp2002", new Student("Black"));
        Black.addGrade(90);
        Black.addGrade(85);
        Black.addGrade(70);
        Student Alex = new Student("Alex");
        students.put("bobsplace", new Student("Alex"));
        Alex.addGrade(85);
        Alex.addGrade(75);
        Alex.addGrade(90);

        System.out.println(students);




    }
}
