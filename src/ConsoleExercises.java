import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

//        For the following exercises, create a new class named ConsoleExercises with a main method like the one in your HelloWorld class.
//
//        Copy this code into your main method:
//
        double pi = 3.14159;

//        1. Write some Java code that uses the variable pi to output the following:
////
//        The value of pi is approximately 3.14.
        System.out.println("The value of pi is approximately " + pi);
//                Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
//
//        System.out.format("The value of pi is approximately " + pi);

//        Explore the Scanner Class.


//        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: " + userInput);
//        What happens if you input something that is not an integer?
        //  System still prints whatever is enetered

//        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//

//        System.out.print("Enter 3 word sentence: ");
//        String userInput2 = scanner.nextLine();
//        System.out.println(userInput2);
//        String wordOne = sc.next();
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//
//        System.out.print("1: %s\n2,%s\n3: %s, wordOne,wordTwo,wordThree");
//                What happens if you enter less than 3 words?  // It will print what ever you enter
//                What happens if you enter more than 3 words? // It will print what ever you enter
//        3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        System.out.println("Enter a complete sentence.");
//        String userInput3 = scanner.next();
//        System.out.println(userInput3);
//
//        String.sentence = sc.nextLine();
//        System.out.println(sentence);
//        do you capture all the words?

//         4. Rewrite the above example using the nextLine method.

//        System.out.println("Enter a complete sentence.");
//        String userInput3 = scanner.nextLine();
//        System.out.println(userInput3);
//
//                Calculate the perimeter and area of Codeup's classrooms.


//        1. Prompt the user to enter values of length and width of a classroom at Codeup.

//        System.out.print("What is the length of the classroom?");
//        int userWidth = scanner.nextInt();
//        System.out.println(userWidth);
//
//        System.out.print("What is the width of the classroom?");
//        int userLength = scanner.nextInt();
//        System.out.println(userWidth);



//
//                Use the nextLine method to get user input and parse the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
//        2. Display the area and perimeter of that classroom.
//
//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//        int area = userWidth * userLength;
//        System.out.println("Area of the classroom is " + area + " sq.ft");
//
//        int perimeter = 2*userWidth +2*userLength;
//        System.out.println("Perimeter of classroom is " + perimeter + " sq.ft" );

//         Bonuses


//        In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.

//        System.out.println("What is the height of the classroom?");
//        int userheight = scanner.nextInt();
//
//        int volume = userLength * userWidth * userheight;
//        System.out.println("Volume of the classroom is " + volume + " cu.ft");
////
//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
    }
}
