package code.examples.primitive_and_syntax;

import java.util.Scanner;

/**
 * Created by Rustam on 23.02.2015.
 */
public class IntToCharCast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------");
        System.out.println("Enter only integer values or word 'exit' for exit from program.");
        System.out.println("Programme work with Unicode charset.");
        System.out.println("---------------------------------------------------------------");

        while (true){
            System.out.print("Enter char code: ");
            String strCode = scan.next();

            if (strCode.equalsIgnoreCase("exit"))
                break;

            try {
                int code = Integer.valueOf(strCode);
                System.out.println("Character with code '" + code + "' is '" + (char)code + "'");
            } catch (NumberFormatException e) {
                System.out.println("Please enter right value.");
            }
        }
    }
}
