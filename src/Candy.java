////public class Candy {
////
////        public String name;
////        public String size;
//            public String[] descriptors
////
////        public Candy(String name){
////            this.name = name;
////            this.size = "unknown";
////
////        }
////        public static void main(String[] args) {
////            Candy unknownCandy = new Candy("funky candy");
////
////
////            System.out.println("unknowCandy.name = " + unknownCandy.name);
////            System.out.println("unkownCandy.size = " + unknownCandy.size);
////    }
////}
//
////    Write a public class named ‘Candy’ - this class should have two public fields, both taking in a string literal as a value.
////        The first would be ‘name’ and the second will be ‘size’.
////        The class will also need two constructors - the first for if we know the name, but not the size. Your first constructor should set some kind of string literal for the size.
////        The second would be for if we know both the name and the size. This second constructor will pass through those arguments into the Candy object being instantiated.
////        BONUS:
////        Write a method for your Candy class - this method should print out a message saying:
////        “Ahhh, a [name]! I see that you got the [size] of it. Sounds good! :)”
//

//import java.util.Arrays;
//
//public class Candy {
//    public String name;
//    public String size;
//    public String[] descriptors;
//
//    public void talkaboutCandy(){
//        System.out.printf("Ahh, a %s! I see you also got the %s size of it. Looks good! :) %n", this.name, this.size);
//    }
//
//    public String stringReturnCandy(){
//        return "Oh, a " + this.name + "! I see you got the " + this.size + " of it";
//    }
//
//    public Candy(String name){
//        this.name = name;
//        this.size = "unknown";
//
//    }
//
//    public Candy(String name, String size){
//        this.name = name;
//        this.size = size;
//    }
//
//    public Candy(String name){
//
//    }
//
//
//    public static Candy[] addCandy(Candy[] oldArray, Candy newCandy){
//        Candy[] newarrPlusOne = Arrays.copyOf(oldArray, oldArray.length+1); //copy oldarr to the new one and add an additional index of length
//
//        newarrPlusOne[newarrPlusOne.length-1] = newCandy;
//
//        return newarrPlusOne;
//    }
//
//    public static void main(String[] args) {
//
//        //Below: arr exer1 based example
//
//        Candy unknownCandy = new Candy("funky candy");
//        Candy funsizeSnickers = new Candy("Snickers", "fun-size");
//        Candy fullsizeKitKat = new Candy("Kit-Kat", "full-size");
//
//        Candy[] myBag = {unknownCandy, funsizeSnickers, fullsizeKitKat};
//
//        for(Candy singleCandy : myBag){ //Let's iterate through the old bag first
//            System.out.println(singleCandy.name);
//        }
//
//        //Let's use our method to add in a new candy we got:
//
//        Candy newCandy = new Candy("Hershey's Kiss", "kiss-size");
//
//        Candy[] newBag = Candy.addCandy(myBag, newCandy);
//
//        for(Candy singleCandy : newBag){//Ah! Now let's see if our new candy is in this array
//            System.out.println(singleCandy.name);
//        }
//
//
//    }
//}

/*
  Yesterday - we made a CANDY CLASS that looks preeeeety good
  2 constructors- noice. It has a couple of properties - double noice.class
  Perhaps our Candy class could use a new property that would be an array of Strings - this property, named descriptors would be a String of words that describe the candy. For example, maybe M and Ms would be described as "candy-coated", "chocolate', and "bite-sized".
  It looks like we'll need a new constructor as well to deal with this property.
 BONUS:
 Set up, in your main metho, and array of Candy objects named "myBag" - iterate through the Candy objects and described them like so:
 "I have a piece of [name] that is [size] and could be described as [descriptors]";
*/

