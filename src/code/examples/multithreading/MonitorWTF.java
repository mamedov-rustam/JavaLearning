package code.examples.multithreading;

import java.io.IOException;

/**
 * Created by Rustam on 25.02.2015.
 */
public class MonitorWTF {
    public static void main(String[] args) throws InterruptedException{
        // Show 'autoboxing' package for mor details
        synchronized ((Object)2) {
            ((Object)2).notify();
            System.out.println("All right(1)");
        }

        synchronized ("I_am_monitor") {
            "I_am_monitor".notify();
            System.out.println("All right(2)");
        }
    }
}
