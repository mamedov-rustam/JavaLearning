package code.examples.oop;

/**
 * Created by Rustam on 02.03.2015.
 */
public class ClassCastExample1 {
    static class Vehicle {
        public void printSound() {
            System.out.print("vehicle");
        }
    }

    static class Car extends Vehicle {
        public void printSound() {
            System.out.print("car");
        }
    }

    static class Bike extends Vehicle {
        public void printSound() {
            System.out.print("bike");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        Bike b = (Bike) v;

        v.printSound();
        b.printSound();
    }

}
