package oldClasses;

public class Student {
    String name;
    String surname;
    int age;
    static String university = "BDU";

    Student() {
        age = 50;
    }

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void print() {
        System.out.println(this.name);
        System.out.println(this.surname);
        System.out.println(this.age);
    }

    static void test() {
        System.out.println("test");
    }

    boolean equals(Student s) {
        if (this.name.equals(s.name) && this.surname.equals(s.surname) && this.age == s.age) {
            return true;
        }
        return false;
    }

}
