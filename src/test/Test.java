package test;

/**
 * Created by Rustam on 27.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        Class1 a  = new Class3();
        a.print();
    }
}

class Class1{
    public String str = "Parent string";

    public void print(){
        System.out.println(str);
    }
}

class Class2 extends Class1{
    private String str = "Layer string";
}

class Class3 extends Class2{
    public String str = "Child string";

    Class3(){
        System.out.println(((Class1)this).str);
        System.out.println(str);
    }

    @Override
    public void print(){
        System.out.println(str);
    }
}
