package chap1_10.abs;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();


        Pet[] pets = {dog, cat, new Tiger()};
        for (Pet pet : pets) {
            pet.feed();
            pet.sleep();
        }
    }
}
