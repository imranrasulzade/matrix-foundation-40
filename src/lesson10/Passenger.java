package lesson10;

public class Passenger {
    private String name;
    private String surname;
    private boolean isBaggage;
    private String seat;
    private int age;

    private static int COUNT;

    public Passenger(String name, String surname,
                     boolean isBaggage, String seat) {
        COUNT++;
        this.name = name;
        this.surname = surname;
        this.isBaggage = isBaggage;
        this.seat = seat;
    }

    public Passenger() {
        COUNT++;
    }

    public void print() {
        System.out.println(this.name + " " + this.surname +
                ", baggage: " + this.isBaggage + ", seat: " + this.seat);
    }

    public static int getCount() {
        return COUNT;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isBaggage() {
        return isBaggage;
    }

    public void setBaggage(boolean baggage) {
        isBaggage = baggage;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public static int getCOUNT() {
        return COUNT;
    }

    public static void setCOUNT(int COUNT) {
        Passenger.COUNT = COUNT;
    }
}
