package lesson12;

public class Pilot extends Employee implements Flyable{

    public Pilot(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {

    }

    @Override
    public void fly() {

    }
}
