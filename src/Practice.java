import java.util.stream.IntStream;

public class Practice {

    public static void main(String[] args)
    {

//        System.out.printf("%.3f",3.1459);

    fizzbuzzBeforeJava8(100);
    orangeAppleInJava8(100);


    }
    private static void orangeAppleInJava8(int num)
    {
        IntStream.rangeClosed(1,100)
                .mapToObj(i -> i % 5 ==0 ? (i % 7 == 0 ? "OrangeApple" : "Orange") : (i % 7 == 0 ? "Apple" : i))
                .forEach(System.out::println);
    }


    public static void fizzbuzzBeforeJava8(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if (((i % 5) == 0) && ((i % 7) == 0)) // Is amultiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0) // Is a mutiple of 5?
                System.out.println("fizz");
            else if ((i % 7) == 0) // Is a multiple of 7?
                System.out.println("buzz");
            else
                System.out.println(i);  // Not a mutiple of 5 or 7

        }
    }



}
