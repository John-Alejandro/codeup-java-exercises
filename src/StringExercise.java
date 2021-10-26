public class StringExercise {
    public static void main(String[] args) {

//        1. String Basics.
//
//        Create a class named StringExercise with a main method. - Done
//
//        For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.
//
//
//        We don't need no education
        String message = "We don't need no education";
        System.out.println(message);

//        We don't need no thought control
        System.out.println(message.replace("education","thought control"));
//
//        Check "this" out!, "s inside of "s!
        String message1 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message1);
//
//        In windows, the main drive is usually C:\
        String message2 = "In windows, the main drive is usually C:\\";
        System.out.println(message2);
//
//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!
        String message3 = "I can do backslashes \\, double backslashes \\\\,\n and the amazing triple backslash \\\\\\!";
        System.out.println(message3);

//
    }
}
