import java.util.Arrays;

public class ArraysExercises {
////    Array Basics
////
////    1. Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
public static void main(String[] args) {
//
//

//    What happens when you run the following code? Why is Arrays.toString necessary?
//
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println(numbers);
//    // Source reference code is visible
    System.out.println(Arrays.toString(numbers));
//    // Array elements visible
//
////    Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
//
//    Person[] arr;
//    arr = new Person[3];
//    Person Jose = new Person("Jose");
//    Person Mathias = new Person("Mathias");
//    Person Bernie = new Person("Bernie");
    String[] Person = {"Jose, Mathias, Bernie"};
        for (String singleElement : Person) {
            System.out.printf("%s", singleElement);
            System.out.println();
        }
    String [] myCohorts = {"Jose", "Mathias", "Bernie"};
    for (String singleElement : myCohorts){
        System.out.printf("%s", singleElement);
        System.out.println();
    };
//    Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    Person addPerson = new Person("Patrick");
//    Person[] newCohorts = Person.addPerson(myCohorts, addPerson);
    System.out.println("Patrick");








//

    }
}
