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

//        2. Create a class named Bob with a main method for the following exercise.
//
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

    }
}
