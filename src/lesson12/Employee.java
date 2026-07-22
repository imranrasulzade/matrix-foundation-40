package lesson12;

public abstract class Employee {

    public String name;
    public double salary;

    public Employee(){

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();

}
