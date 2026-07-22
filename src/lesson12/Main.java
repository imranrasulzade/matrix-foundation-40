package lesson12;


public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new Teacher("Gulcin", 1500, "Math"),
                new Programmer("Alisa", 3000, "C#"),
                new Teacher("Sevinc", 1700, "Chemistry")
        };

        Programmer programmer = new Programmer("Sevinc", 5000, "Pyhton");


//        Employee employee = new Employee("imran", 50) {
//            @Override
//            public void work() {
//                System.out.println("Imran isliyir");
//            }
//        };




        for (Employee emp : employees) {
            emp.work();
        }


    }
}
