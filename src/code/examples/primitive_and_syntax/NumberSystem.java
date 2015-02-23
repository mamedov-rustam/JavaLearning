package code.examples.primitive_and_syntax;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class NumberSystem {
    public static void main(String[] args) {
        System.out.println(0xA1C);   // Hexadecimal 0x
        System.out.println(1243134); // Decimal
        System.out.println(0546);    // Octal 0798

        System.out.println(Integer.toHexString(56687)); //Hexadecimal
        System.out.println(Integer.toOctalString(56687)); //Octal
        System.out.println(Integer.toBinaryString(56687)); //Binary

        System.out.println(Integer.parseInt("2121012", 3)); //Also we can parse string to need radix
    }
}
