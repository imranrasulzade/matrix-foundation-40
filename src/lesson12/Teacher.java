package lesson12;

public class Teacher extends Employee{

    private String subject;

    public Teacher(String name, double salary, String subject){
        super(name, salary);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void work() {
        System.out.println("Teacher dərs keçir.");
    }

    public void makeHW() {
        System.out.println("Teacher make homework for students");
    }
}
