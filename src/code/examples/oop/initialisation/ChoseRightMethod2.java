package code.examples.oop.initialisation;

/**
 * Created by Rustam on 01.03.2015.
 */
//Обьяснение 1
//        Вариант с "int" отпадает так как в метод была передана ссылка,
//        а не примитивный тип данных, далее можно заметить что статический метод f
//        не переопределен, а перегружен, значит выбирается метод, основываясь на типе ссылки(Object),
//        а не на типе обьекта(Integer)
//
//Обьяснение 2
//        Переменная i имеет тип Object. Соответственно, будет выбран метод f(Object).

public class ChoseRightMethod2 {
    static void f(int a) {
        System.out.println("int");
    }

    static void f(Integer a) {
        System.out.println("Integer");
    }

    static void f(Object a) {
        System.out.println("Object");
    }

    static public void main(String[] args) {
        Object i = new Integer(10);
        f(i);
    }

}
