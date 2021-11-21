package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static String Jay;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //HashMap<keyDatatype, valueDatatype> nameVar = new HashMap<>();
        HashMap<String, Student> students = new HashMap<>();

        Student john = new Student("John");
        Student angela = new Student("Angela");
        Student jackie = new Student("Jackie");
        Student bob = new Student("Bob");


        john.addGrade(88);
        john.addGrade(90);
        john.addGrade(80);
        john.addGrade(91);
        john.addGrade(85);

        angela.addGrade(99);
        angela.addGrade(95);
        angela.addGrade(91);
        angela.addGrade(93);
        angela.addGrade(100);

        jackie.addGrade(91);
        jackie.addGrade(85);
        jackie.addGrade(71);
        jackie.addGrade(79);

        bob.addGrade(81);
        bob.addGrade(95);
        bob.addGrade(91);
        bob.addGrade(79);



        students.put("Alejandro_the_man", john);
        students.put("Angela_the_Baby", angela);
        students.put("Jackie_the_Wrestler", jackie);
        students.put("Bob_the_Cat", bob);

        System.out.println(john);
        System.out.println(students);

        boolean continueFlag = true;

        System.out.println("Welcome to grade application, now loading.");

        while ( continueFlag) {
            System.out.println("Here are student's Github usernames :");
            String message = "|";
            for (String gitName : students.keySet()) {
//                System.out.println(gitName);
                message += gitName + " | ";
            }
            System.out.println(message);
            System.out.println("Which student do you want more info on?");

            String userSearch = myScanner.nextLine();
            Student result = students.get(userSearch);

            if (result == null){
                System.out.printf("No result found for %s%n", userSearch);
             } else {
                System.out.printf("Match found for gitName %s, %s is the name of the student. Here is their current grade average : %s%n", userSearch, result.getName(), result.getGradeAverage());
            }

            continueFlag = false;


    }
}}
