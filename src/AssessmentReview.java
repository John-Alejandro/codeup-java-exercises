import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.Locale;

public class AssessmentReview {

    // Write a public static method named cubed that accepts an integer as an argument and returns that integer to the third power.
    public static int cubed (int arg) {
        return arg * arg * arg;
    }

    //Write a public static method named difference that accepts two arguments and that works with both integers and doubles (use method overloading). Both variations of the method should return the result of subtracting the second argument from the first argument.
//    public static int difference(int one, int two) {
//        return one - two;

//    public static double difference(double one, double two) {
//            return one - two;
//    }

    // Write a public static method named median that receives an array of ints (please use an array, not a Collection) and returns the median as a double.
    //(Hint: there are examples of how to find median of an array in Java all over the internet)
    //(Hint: the sort method on the Arrays class may be very helpful here)
    //(Hint: make sure the median of [1, 3, 4, 2, 6, 5, 8, 7] is 4.5)
    public static double median(int[] arr) {
        Arrays.sort(arr);
        double median;
        if(arr.length % 2 == 0) {
            median = ((double) arr[arr.length / 2] + (double) arr[arr.length / 2 - 1] / 2);
        } else {
            median = (double) arr[arr.length / 2];
        }
        return median;
    }
//    public static boolean isUpperCase(String s) {
//
//        for (int i = 0; i < s.length(); i++) {
//            if (!Character.isUpperCase(s.charAt(i))) {
//                return  false;
//            }
//        }
//        return true;
//    }

//public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat>cats){
//    for (Cat cat: cats) {
//        if(isUpperCase(cat.getColor())) {
//            continue;
//        } else {
//            String newColor = cat.getColor().toUpperCase();
//            cat.setColor(newColor);
//        }
//    }
//}


    public static void main(String[] args) {
        System.out.println(8 == AssessmentReview.cubed(2));
//        System.out.println(125 != AssessmentReview.cubed(5));
//        System.out.println(15625 == AssessmentReview.cubed(25));
        System.out.println(cubed(3));
//        System.out.println(100 == AssessmentReview.difference(150, 50));
//        System.out.println(-2 == AssessmentReview.difference(5, 7));
//        System.out.println(difference(5,4));
//        System.out.println(4.5 == AssessmentReview.median(new int[]{1, 3, 4, 2, 6, 5, 8, 7}));
//        System.out.println(7.0 == AssessmentReview.median(new int[]{2, 20, 3, 7, 7, 5, 8, 7, 10, 0}));
    }

}
