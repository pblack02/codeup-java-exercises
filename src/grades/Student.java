package grades;

import java.util.ArrayList;

public class Student {
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    private String name;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    private ArrayList<Integer> grades;


    // returns the student's name
    public String getName(){
       return this.name = name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
//    public double getGradeAverage(){
//        double total = 0;
//        double avg;
//        for (double grade : grades) {
//            total += grade;
//        }
//        avg = total / grades.size();
//        System.out.println("total " + total);
//        System.out.println("Number of grades" + grades.size());
//        return avg;
//    }
    public double getGradeAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }


}
