package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void test(Student s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
//        int a = 5;
//        Integer b = null;
//        Long c = 55L;
//        Boolean l = null;


//        List<String> nameList = new ArrayList<>();
//        nameList.add("Aysel");
//        nameList.add("Aytac");
//        nameList.add("Alisa");
//        nameList.add("Sevinc");

//        System.out.println(nameList);

//        nameList.remove(3);
//        nameList.remove("Aytac");
//
//        for (String name : nameList) {
//            System.out.println(name);
//        }
//
//        System.out.println(nameList.getFirst());
//        System.out.println(nameList.getLast());
//        System.out.println(nameList.get(1));
//
//        System.out.println(nameList.get(20)); // xeta IndexOutOfBoundsException


//        List<String> list = List.of("Alma", "Armud", "Banan"); // immutable list
//        list.add("Heyva"); // xeta UnsupportedOperationException


//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(99);
//        numbers.add(3);
//        System.out.println(numbers);

//        List<Student> studentList = new ArrayList<>();
//        Student s1 = new Student("Sevinc", "Mammadova", 18);
//        Student s2 = new Student("Aysel", "Ismayilova", 17);
//        Student s3 = new Student("Aytac", "Sakitli", 22);
//
//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//        System.out.println(studentList.size());
////        studentList.forEach(Main::test);
//
//        for (Student s : studentList) {
//            Main.test(s);
//        }

        Map<Integer, String> nameMap = new HashMap<>();
        nameMap.put(5, "Aysel");
        nameMap.put(6, "Sevinc");
        nameMap.put(7, "Alex");
        nameMap.put(8, "Alisa");
        nameMap.put(null, "Alisa1");

        System.out.println(nameMap.get(5));
        System.out.println(nameMap.keySet());
        System.out.println(nameMap.size());
        System.out.println(nameMap.containsKey(7));
        System.out.println(nameMap.containsValue("Alex"));
        System.out.println(nameMap.getOrDefault(6, "Salam"));
        System.out.println(nameMap.get(8));

        System.out.println(nameMap);

        for (Integer i : nameMap.keySet()) {
            System.out.println(nameMap.get(i));
        }



    }


}
