package reLesson11;

public class Dog extends Animal {
    public Dog(){

    }

    @Override
    public void makeSound(){
        System.out.println("hav hav");
    }

    public void makeSound(String n){
        System.out.println("hav hav");
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public void specialForDog() {
        System.out.println("dog special method");
    }
}
