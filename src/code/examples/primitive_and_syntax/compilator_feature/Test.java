package code.examples.primitive_and_syntax.compilator_feature;

/**
 * Created by Rustam on 23.02.2015.
 */
public class Test {
    // Try start it.
    public static void main(String[] args) {
        String[] strArr = new String[10];
        Object[] objArr = strArr;
        objArr[1] = new int[]{4, 7, 8, 9};
    }
}
