package code.examples.oop.class_extends;

/**
 * Created by Rustam on 23.02.2015.
 */
public class Women extends Human {
    private boolean mother;

    public Women(String name, String surname, int age) {
        super(name, surname, age, false);
    }

    public Women(String name, String surname, int age, boolean mother) {
        super(name, surname, age, false);
        this.mother = mother;
    }

    public boolean isMother() {
        return mother;
    }

    public void becomeMother(){
        if (!mother)
            mother = true;
        else
            throw new RuntimeException(getName() + " " + getSurname() + " already the mother.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Is mother: " + (mother ? "yes" : "no");
    }
}
