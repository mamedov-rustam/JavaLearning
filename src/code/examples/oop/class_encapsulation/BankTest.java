package code.examples.oop.class_encapsulation;

import java.util.Date;

/**
 * Created by Rustam on 23.02.2015.
 */
public class BankTest {
    public static void main(String[] args) throws IllegalAccessException{
        Bank bank = new Bank();
        bank.addNewClient("John", "789546", 155.9);
        bank.addNewClient("Susan", "my7a8a", 87.7);
        bank.addNewClient("Kate", "qwerty", 41.5);
        bank.addNewClient("David", "hellopass", 238.0);

        // Try this and change comment (2) -> (1)
        bank.takeMoney(1, "789546", 100);
        bank.takeMoney(3, "not_right_pass", 10); // (1)
        //bank.takeMoney(4, "hellopass", 358); (2)

    }
}
