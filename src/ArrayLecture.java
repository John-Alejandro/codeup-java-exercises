//import java.util.Arrays;
//
//public class ArrayLecture {
//
//
//
//    public static void main(String[] args) {
//        double[] prices = new double[4];
//        final int numberOfSides = 6;
//
//        int[] diceSides = new int[numberOfSides];
//
//        System.out.println("prices.length = " + prices.length);
//        System.out.println("diceSides.length = " + diceSides.length);
//
//        System.out.println("diceSides[0] = " + diceSides[5]);
//
//        String[] mybag = {"Snickers", "Reese's", "Brussel Sprouts"};
//
//        System.out.println("mybag.length = " + mybag.length);
////        System.out.println("mybag[1] = " + mybag[1]);
//
////        for (int i = 0; i < mybag.length; i++){
////            System.out.println(mybag[i]);
////
////        }
////
//        for (String singleElement : mybag){
//            System.out.printf("%s is the piece of candy you just pulled out of the bag of %n", singleElement);
//            System.out.println();}
//
//        String[] anotherbag = new String[12];
//
//        System.out.println("anotherbag[0] = " + anotherbag[0]);
//        System.out.println("anotherbag[5] = " + anotherbag[5]);
//
//        Arrays.fill(anotherbag, "reese's peanut butter cup");
//
//        for (String candy : anotherbag){
//            System.out.println(candy);
//        }
//        System.out.println();
//
//        System.out.println("Arrays.equals(anotherbag, anotherbag) = " + Arrays.equals(anotherbag, anotherbag));
//
//        String[] mybagplusone = Arrays.copyOf(mybag, mybag.length + 1);
//        System.out.println("mybag.length = " + mybag.length);
//        System.out.println("mybagplusone.length = " + mybagplusone.length);
//
//        mybagplusone[mybagplusone.length-1] = "skittles";
//        for (String candy : mybagplusone){
//            System.out.println(candy);
//        }
//        System.out.println();
//
//        //Stringify array
//        System.out.println(Arrays.toString(mybagplusone));
//
//        //Sort array
//        Arrays.sort(mybagplusone);
//        for (String candy : mybagplusone){
//            System.out.println(candy);
//        }
//
//        //Searching inside of array
//        int skittlesindex = Arrays.binarySearch(mybagplusone, "skittles");
//        int snickersindex = Arrays.binarySearch(mybagplusone, "Snickers");
//
//        System.out.println("This should be some skittles for Jackie: " + mybagplusone[skittlesindex]);
//        System.out.println("This should be some snickers for myself : " + mybagplusone[snickersindex]);
//
//
//
//        int[][] matrix = {
//                {1, 2, 3}, //arr1
//                {4, 5, 6}, //arr2
//                {7, 8, 9}  //arr3 . . these three arrays are ELEMENTS of the outer array
//        };
//
//        int[] arrExample = new int[]{1, 2, 3};
//        System.out.println("arrExample[1] = " + arrExample[1]);
//        System.out.println("arrExample = " + Arrays.toString(arrExample));
//
//        System.out.println("matrix[0] = " + Arrays.toString(matrix[0]));
//        System.out.println("matrix[1] = " + Arrays.toString(matrix[1]));
//        System.out.println("matrix[2] = " + Arrays.toString(matrix[2]));
//
//        System.out.println("matrix[1][1] = " + matrix[1][1]); //matrix[1] = [4,5,6]; [4,5,6][1] == 5
//
//
////        for (int[] row : matrix) {
////            System.out.println("+---+---+---+");
////            System.out.print("| ");
////            for (int n : row) {
////                System.out.print(n + " | ");
////            }
////            System.out.println();
////        }
////        System.out.println("+---+---+---+");
//
//
//
//
//    }
//}

//import java.util.Arrays;
//
//public class Candy {
//    public String name;
//    public String size;
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
//
//
