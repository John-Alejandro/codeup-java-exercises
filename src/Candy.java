public class Candy {

        public String name;
        public String size;

        public Candy(String name){
            this.name = name;
            this.size = "unknown";

        }
        public static void main(String[] args) {
            Candy unknownCandy = new Candy("funky candy");


            System.out.println("unknowCandy.name = " + unknownCandy.name);
            System.out.println("unkownCandy.size = " + unknownCandy.size);
    }
}

//    Write a public class named ‘Candy’ - this class should have two public fields, both taking in a string literal as a value.
//        The first would be ‘name’ and the second will be ‘size’.
//        The class will also need two constructors - the first for if we know the name, but not the size. Your first constructor should set some kind of string literal for the size.
//        The second would be for if we know both the name and the size. This second constructor will pass through those arguments into the Candy object being instantiated.
//        BONUS:
//        Write a method for your Candy class - this method should print out a message saying:
//        “Ahhh, a [name]! I see that you got the [size] of it. Sounds good! :)”
