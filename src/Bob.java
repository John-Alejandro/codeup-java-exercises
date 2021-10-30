import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        2. Create a class named Bob with a main method for the following exercise. - Done
//
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        Scanner scanner = new Scanner(System.in);
        String sentence;
        boolean keepTalking;

        System.out.println("Bob is new here, would you like to get to know him?");
        System.out.println("Lets start the conversation.");

        do {
            System.out.println("What would you like to ask Bob?");
            sentence = scanner.nextLine();

            if (sentence.endsWith("?")) {
                System.out.println("Sure");
            } else if (sentence.endsWith("!")) {
                System.out.println("Whoa,chill out Dude!");
            } else if  (sentence.equals(" ")) {
                System.out.println("Fine. Be that way!");
            } else  {
                System.out.println("Whatever");
            }

               System.out.println("Would you like to continue talking with Bob? (y/n)");
               keepTalking = scanner.nextLine().equalsIgnoreCase("y");
        } while(keepTalking);
    }
}
