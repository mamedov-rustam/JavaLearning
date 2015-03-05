package code.examples;

import java.io.Console;

/**
 * Created by Rustam on 05.03.2015.
 */
public class ConsolePasswordSecurity {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Start this program via the command shel.");
            System.exit(0);
        }
        String pass = new String(console.readPassword("Password: "));
        System.out.println("Your password: " + pass);
    }
}
