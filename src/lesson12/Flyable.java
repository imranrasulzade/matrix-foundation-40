package lesson12;

public interface Flyable {

    int a = 50;

    void fly();

    default void test() {
        System.out.println("sadnas");
    }

    static void salam() {

    }

}
