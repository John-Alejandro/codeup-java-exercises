import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        1. Loop Basics
//
//        a. While
//
//        Create an integer variable i with a value of 5.

//        int i  = 5;

//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        while ( i <= 15) {
//            System.out.print(" " + i++);
//        }

//
//        b. Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//
//        do {
//            i += 2;
//            System.out.println(i);
//        }
//        while ( i <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//
//        do {
//            i -= 5;
//            System.out.println(i);
//        }
//        while ( i > -10 );

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        int i = 2;
//
//        do {
//            i = i * i;
//            System.out.println(i);
//        }
//        while (i <= 10000);

//        c. For
//        Refactor the previous two exercises to use a for loop instead.

//        for (int i = 0; i <= 1_000_000; i = i + 2) {
//            System.out.println(i);

//        for (long i = 2; i < 1_000_000; i = i * i) {
//            System.out.println(i);
//        }

//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print ???Fizz??? instead of the number.
//        For the multiples of five: print ???Buzz???.
//        For numbers which are multiples of both three and five: print ???FizzBuzz???.

//        for (int i = 0; i < 100; i++ ) {
//            if (((i % 3) == 0) && ((i % 5) == 0))
//            {
//                System.out.println("Fizzbuzz");
//            }
//             if ((i % 3) == 0)
//            {
//                System.out.println("Fizz");
//            }
//            else if ((i % 5) == 0)
//            {
//                System.out.println("Buzz");
//            }
//            else
//            {
//                System.out.println(i);
//            }
//
//            }


//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        boolean confirm;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter an integer?");
            int userInput = scanner.nextInt();
//
            System.out.println("number |  squared | cubed ");
            System.out.println("------ |  ------- | ----- ");

            for (int i = 1; i <= userInput; i++) {
                System.out.printf("%-7d|%-9d|%-6d\n", i, i * i, i * i * i);
            }
            System.out.println("Do you want to continue? (Y/N)");

            confirm = scanner.next().equalsIgnoreCase(("y"));

        } while (confirm);


        scanner.close();

//        System.out.println("Here is your table!");
//        System.out.println(userInput);
//               int squ = userInput[i] * userInput[i];
//            System.out.println(squ);
//                int cube = userInput[i] * userInput[i] * userInput[i];
//            System.out.println(cube);


//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//


//        boolean confirm;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Enter a numerical grade: ");
//            int grade = scanner.nextInt();
//
//            if (grade < 60) {
//                System.out.println("F");
//            } else if (grade < 67) {
//                System.out.println("D");
//            } else if  (grade < 80) {
//                System.out.println("C");
//            } else if (grade < 88) {
//                System.out.println("B");
//            } else {
//                System.out.println("A");
//            }
//               System.out.println("Do you want to continue? (Y/N)");
//
//               confirm = scanner.next().equalsIgnoreCase(("y"));
//        } while(confirm);


        scanner.close();
    }
}
