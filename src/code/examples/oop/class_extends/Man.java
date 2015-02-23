package code.examples.oop.class_extends;

/**
 * Created by Rustam on 23.02.2015.
 */
public class Man extends Human {
    private boolean father;

    public Man(String name, String surname, int age) {
        super(name, surname, age, true);
    }

    public Man(String name, String surname, int age, boolean father) {
        super(name, surname, age, true);
        this.father = father;
    }

    public boolean isFather() {
        return father;
    }

    public void becomeFather(){
        if (!father)
            father = true;
        else
            throw new RuntimeException(getName() + " " + getSurname() + " already the father.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Is father: " + (father ? "yes" : "no");
    }
}
