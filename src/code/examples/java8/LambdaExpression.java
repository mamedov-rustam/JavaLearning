package code.examples.java8;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Rustam on 24.02.2015.
 */
public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(10));
        }

        Collections.sort(numbers, (val1, val2) -> val2 - val1);

        System.out.println("List's elements: " + numbers);
        System.out.println("Sum all is " + sumAll(numbers, n -> true));
        System.out.println("Sum all evens is " + sumAll(numbers, n -> n % 2 == 0));
        System.out.println("Sum all greater then 5 is " + sumAll(numbers, n -> n > 5));


    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }

}
