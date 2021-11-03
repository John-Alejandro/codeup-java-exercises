//import java.util.Arrays;
//import java.util.Random;

public class ServerNameGenerator {

    public static String randomElementFromarray(String[] string) {

        int aNum = (int) Math.floor(Math.random() * 10);

        return string[aNum];
    }

    public static void main(String[] args) {


        String[] adjectivesArr = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp"};
        String[] nounsArr = {"farm","tree","jeans", "cat", "dog","sock", "ship", "hero", "baby", "monkey"};

//        Random random = new Random();
        System.out.println("Your random picks are: " + randomElementFromarray(nounsArr) + "-" + randomElementFromarray(adjectivesArr));


    }
}
// 2. Server Name Generator
//
//    We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//    Example Output
//
//
//    Here is your server name:
//    dedicated-photon


//