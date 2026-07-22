package oldClasses;

public class Lesson9 {

    static void printStudent(Student student) {
        System.out.println(student.name);
        System.out.println(student.surname);
        System.out.println(student.age);
    }

    public static void main(String[] args) {

        int a = 5;
        Student student = new Student("Gulcin", "Xancanli", 19);
        Student st = new Student("Gulcin", "Xancanli", 19);
        Student student1 = new Student("Kifayet", "Aliyeva", 19);
//        student.name = "Gulcin";
//        student.surname = "Xancanli";
//        student.age = 19;


        System.out.println(student.equals(st));

        student.print();

        printStudent(student);


//        System.out.println(student1.name);
//        System.out.println(student1.surname);
//        System.out.println(student1.age);


    }
}
