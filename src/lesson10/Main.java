package lesson10;

public class Main {

    static void printPassengerArray(Passenger[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
    }

    public static void main(String[] args) {

        Passenger p = new Passenger("Gulcin",
                        "Xancanli",
                        false,
                        "1A");
//        p.name = "Gulcin";
        p.setName("Gulcinnnnn");
//        p.surname = "Xancanli";
//        p.isBaggage = false;
//        p.seat = "1A";

        System.out.println(p.getName());


        Passenger k = new Passenger("Kifayet",
                "Aliyeva",
                true,
                "1B");

//        k.surname = "Aliyeva";
//        k.isBaggage = true;
//        k.seat = "5H";


//        System.out.println(Passenger.COUNT);
//        p.print();
//        k.print();
        System.out.println(Passenger.getCount());

        Passenger[] array = new Passenger[2];
        array[0] = p;
        array[1] = k;

        printPassengerArray(array);



//        Author a = new Author();
//        a.name = "Aytac";
//        a.surname = "Sakitli";
//
//        Book book = new Book();
//        book.title = "Salam";
//        book.publisher = "ABC MMC";
//        book.year = "2024";
//        book.author = a;

    }
}
