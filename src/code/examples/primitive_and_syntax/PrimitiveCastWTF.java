package code.examples.primitive_and_syntax;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class PrimitiveCastWTF {
//  (+(-(+(-(1))))) == 1
    public static void main(String[] args) {
        System.out.println((byte) + (char) - (int) + (long) - 1);
    }
}
