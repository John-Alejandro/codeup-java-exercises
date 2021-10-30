import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void sayHello(){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Person jason = new Person();
//        jason.name = "Jason";
//
//        System.out.println(jason.name);
//        System.out.println("Hello! " + jason.name);

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
};

//    1. Object basics
//
//    Create Person class inside of src that has a private name property that is a string, and the following methods:
//
//
//    public String getName(){
////TODO: return the person's name
//    }
//
//    public void setName(String name){
////TODO: change the name property to the passed value
//    }
//    public void sayHello(){
////TODO: print a message to the console using the person's name
//    }
//
//    The class should have a constructor that accepts a `String` value and sets
//    the person's name to the passed string.
//
//    Create a `main` method on the class that creates a new `Person` object and
//    tests the above methods.
//    1. Understanding references
//
//    The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.
//
//
//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//    System.out.println(person1.getName().equals(person2.getName()));    This is true because we are comparing value.
//    System.out.println(person1 == person2);                             This is false because we are comparing reference of person.
//
//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);                             This is true because it same person no new pwerson created
//
//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1.getName());                              John
//    System.out.println(person2.getName());                              John
//    person2.setName("Jane");
//    System.out.println(person1.getName());                              Jane
//    System.out.println(person2.getName());                              Jane


//