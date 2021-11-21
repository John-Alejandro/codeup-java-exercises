package grades;

import java.util.ArrayList;

public class Student {
    private String name;                            // students name
private ArrayList<Integer> grades;                  // student grades


    // constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();            // new students grades
    }

    public String getName() {                       // returns the students name
        return this.name;
    }

    public void addGrade(int grade) {               // adds the given grade to the grades property
        this.grades.add(grade);
    }

    public double getGradeAverage() {                   // returns the average of the students grades
        double sum = 0;                                     // a bucket to store the sum of the grades
//        for (int i = 0; i < grades.size(); i++) {           // Can use advanced loop for( int grade : this.grades({
//            gradeAverage = gradeAverage + grades.get(i);        //                      sum += grade;
            for (int grade : this.grades){
                sum += grade;
        }
        return sum / this.grades.size();
    }



        
        public static void main(String[] args) {

//            Student john = new Student("John");
//            Student angela = new Student("Angela");
//            Student jackie = new Student("Jackie");
//
//            john.addGrade(88);
//            john.addGrade(90);
//            john.addGrade(80);
//            john.addGrade(91);
//            john.addGrade(85);
//
//            angela.addGrade(99);
//            angela.addGrade(95);
//            angela.addGrade(91);
//            angela.addGrade(93);
//            angela.addGrade(100);
//
//            jackie.addGrade(91);
//            jackie.addGrade(85);
//            jackie.addGrade(71);
//            jackie.addGrade(98);
//            jackie.addGrade(90);
//
//            System.out.println("john.grades = " + john.grades);
//            System.out.println("angela.grades = " + angela.grades);
//            System.out.println("jackie.grades = " + jackie.grades);
//            System.out.println("----Grade Averages------");
//            System.out.println("john.getGradeAverage = " + john.getGradeAverage());
//            System.out.println("angela.getGradeAverage = " + angela.getGradeAverage());
//            System.out.println("jackie.getGradeAverage = " + jackie.getGradeAverage());
//
//
        }

}

//  For this exercise, create a directory inside of src named grades. Create the classes defined below inside of grades.

//  Create a Student class
//
//Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:
//
//
//// returns the student's name
//public String getName();
//// adds the given grade to the grades property
//public void addGrade(int grade);
//// returns the average of the students grades
//public double getGradeAverage();
//Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.