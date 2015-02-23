package code.examples.oop.class_extends;

/**
 * Created by Rustam on 23.02.2015.
 */
public class Human {
    private String name;
    private String surname;
    private int age;
    private boolean sex; // true - man, false - women

    public Human(String name, String surname, int age, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }
    @Override
    public String toString(){
        return  "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Age: " + age + "\n" +
                "Sex: " + (sex ? "man" : "women") + "\n";
    }
}
