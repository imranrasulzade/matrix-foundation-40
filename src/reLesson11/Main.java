package reLesson11;

public class Main {

    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.eat();
//
//        Animal animal = new Animal();
//        animal.eat();

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;
            dog.specialForDog();
        }


        Animal[] animals = {animal1, animal2};

        for (Animal a : animals) {
            a.eat();
        }


    }

}
