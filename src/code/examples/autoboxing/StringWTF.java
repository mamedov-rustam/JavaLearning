package code.examples.autoboxing;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class StringWTF {
    // If you want know why exactly we show this output
    // Read about 'String pool'
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("'str1 == str2' is " + (str1 == str2));
        System.out.println("'str1.equals(str2)' is " + (str1.equals(str2)) + "\n");

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("'str3 == str4' is " + (str3 == str4));
        System.out.println("'str3.equals(str4)' is " + (str3.equals(str4)));
    }
}
