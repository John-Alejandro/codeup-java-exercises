package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
        private String name;
        private ArrayList<Integer> grades;


        // constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

        public String getName() {
            return name;
        }

        public void addGrade(int grade) {
            grades.add(grade);
        }

        public double getGradeAverage() {
            double gradeAverage = 0;
            for (int i = 0; i < grades.size(); i++) {
                gradeAverage = gradeAverage + grades.get(i);

            }
            double Average = (gradeAverage/grades.size());
            System.out.println(Average);
            return Average;
        }
        
        public static void main(String[] args) {

            Student cohort = new Student("John");
            Student cohort2 = new Student("Angela");

            cohort.addGrade(88);
            cohort.addGrade(90);
            cohort.addGrade(80);
            cohort.addGrade(91);
            cohort.addGrade(85);

            cohort2.addGrade(99);
            cohort2.addGrade(95);
            cohort2.addGrade(91);
            cohort2.addGrade(93);
            cohort2.addGrade(100);

            System.out.println(cohort);
//            System.out.println();
            cohort2.getGradeAverage();
            cohort.getGradeAverage();


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