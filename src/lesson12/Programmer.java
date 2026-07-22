package lesson12;

public class Programmer extends Employee{

    private String programmingLanguage;


    public Programmer(String name, double salary, String programmingLanguage){
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("Programmer kod yazır.");
    }
}
