package grades;

import java.util.ArrayList;

public class Student {
    public Student(String name) {
        this.name = name;
    }

    private String name;


    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    private ArrayList<Integer> grades = new ArrayList<>();

    // returns the student's name
    public String getName(){
       return this.name = name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        double avg;
        for(double i = 0; i < grades.size(); i++)
            total += grades.get((int) i);
        avg = total / grades.size();
        return avg;
    }


}
