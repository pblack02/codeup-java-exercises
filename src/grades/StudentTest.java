package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Presley");
        student.addGrade(58);
        student.addGrade(68);

        System.out.println(student.getName());
        System.out.println(student.getGradeAverage());
    }
}
