package code.examples.autoboxing;

/**
 * Created by Rustam on 27.02.2015.
 */
public class StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("My"); // Mutable object
        StringBuilder builderCopy = builder;
        builder.append(" String");
        builder.append(" Builder ");
        builder.append("sample!");

        String str = new String("My"); // Immutable object
        String strCopy = str;
        str += " String";
        str += " Builder";
        str += " sample";

        System.out.println("----------------------------------------------------------");
        System.out.println("builder == builderCopy is " + (builder == builderCopy));
        System.out.println("builder.equals(builderCopy) is " + (builder.equals(builderCopy)));
        System.out.println("builder contains: '" + builder.toString() + "'");
        System.out.println("builderCopy contains: '" + builderCopy.toString() + "'");
        System.out.println("----------------------------------------------------------");
        System.out.println("str == strCopy is " + (str == strCopy));
        System.out.println("str.equals(strCopy) is " + (str.equals(strCopy)));
        System.out.println("str contains: " + str);
        System.out.println("strCopy contains: " + strCopy);
        System.out.println("----------------------------------------------------------");

    }
}
