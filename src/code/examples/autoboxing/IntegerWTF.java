package code.examples.autoboxing;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class IntegerWTF {
//    Returns an Integer instance representing the
//    specified int value. If a new Integer instance
//    is not required, this method should generally be used
//    in preference to the constructor Integer(int),
//    as this method is likely to yield significantly better
//    space and time performance by caching frequently requested
//    values. This method will always cache values in the range -128 to 127,
//    inclusive, and may cache other values outside of this range.
    public static void main(String[] args) {
        boolean equals7to7 = Integer.valueOf(7) == Integer.valueOf(7);
        boolean equals1000to1000 = Integer.valueOf(1000) == Integer.valueOf(1000);

        System.out.println("'Integer.valueOf(7) == Integer.valueOf(7)' is " + equals7to7);
        System.out.println("'Integer.valueOf(1000) == Integer.valueOf(1000)' is " + equals1000to1000);
    }
}
