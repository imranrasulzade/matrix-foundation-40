package reLesson11;

public class Cat extends Animal {

    public void makeSound(){
        System.out.println("miau");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
}
