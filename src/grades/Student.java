package grades;

import java.util.ArrayList;

    public class Student {
        private String name;
        private int grades;


    // constructor
    public Student(String name, int grades) {
        this.name = name;
        this.grades = grades;
    }

        public String getName() {
            return name;
        }

        public void addGrade(int grade) {

        }

        public double getGradeAverage() {
            return grades;
        }


        public static void main(String[] args) {

            // arrayList
            ArrayList<Integer> grades = new ArrayList<>();
            grades.add(88);
            grades.add(85);
            grades.add(90);
            grades.add(81);
            grades.add(93);

            System.out.println("Student's Grades = " + grades);
//            System.out.println(name);
//            System.out.println(getGradeAverage);
//            System.out.println(addGrade);

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