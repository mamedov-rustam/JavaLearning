package code.examples.java8.xml;

import java.util.ArrayList;

/**
 * Created by Rustam on 28.02.2015.
 */
public class SimpleXMLerUsageExample {
    public static void main(String[] args) throws IllegalAccessException{
        Student student = new Student("Alex", "Dwarf", 19);
        System.out.println(student.toXML());

        // Also we can use static method from SimpleXMLer interface:
        // System.out.println(SimpleXMLer.toXML(new ArrayList())); // All about java.util.ArrayList
    }
}

class Student implements SimpleXMLer
{
    private String firstName = null;
    private String lastName = null;
    private int age = 0;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(Integer age){
        this.age = age;
    }
}