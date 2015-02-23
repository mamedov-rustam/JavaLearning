package code.examples.oop.class_extends;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rustam on 23.02.2015.
 */
public class Family {
    public static void main(String[] args) {
        List<Human> family = new ArrayList<Human>();
        family.add(new Man("Stive", "Corner", 34, true)); // Add father
        family.add(new Women("Rusanna", "Corner", 32, true)); // Add mother
        family.add(new Man("Richard", "Corner", 14, false)); // Add son

        for(Human hum : family){
            System.out.println(hum + "\n");
        }
    }
}
