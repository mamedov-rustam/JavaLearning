package code.examples;

/**
 * Created by Rustam on 05.03.2015.
 */
public class CleverString {
    public static void main(String[] args) {
        String str = "";
        // Characters
        str += 'a';
        str += 'a' + '3'; // char + char = int
        // Boolean
        str += false;
        // Numbers
        str += 5;
        str += 0.1f;
        str += 0.3d;
        str += 103l;

        System.out.println(str);
    }
}
