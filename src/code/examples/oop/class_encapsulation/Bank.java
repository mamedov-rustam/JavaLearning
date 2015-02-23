package code.examples.oop.class_encapsulation;

import java.util.*;

/**
 * Created by Rustam on 23.02.2015.
 */
public class Bank {
    private Map<Long, BankClient> clients = new HashMap<>();
    private static long ID_COUNTER = 1;

    public void addNewClient(String name, String pass, double billAmount){
        clients.put(ID_COUNTER++, new BankClient(name, pass, billAmount));
    }

    public void takeMoney(long id, String pass, double sum) throws IllegalAccessException{
        BankClient client = clients.get(id);
        if (client != null && client.checkPassword(pass))
            client.withdrawalBillAmount(sum) ;
    }

    private class BankClient {
        private String name;
        private String pass;
        private double billAmount;

        public BankClient(String name, String pass, double billAmount) {
            this.name = name;
            this.pass = pass;
            this.billAmount = billAmount;
        }

        public boolean checkPassword(String pass) throws IllegalAccessException{
            if (!this.pass.equals(pass))
                throw new IllegalAccessException("Please enter right password!");

            return true;
        }

        public void withdrawalBillAmount(double sum){
            if (this.billAmount < sum)
                throw new UnsupportedOperationException("Current balance lower then need!");
            billAmount -= sum;
            System.out.println(name + " took for bill " + sum + "$");
        }
    }
}
