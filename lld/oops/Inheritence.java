class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

public class Inheritence {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Rocky";

        dog.eat();
        dog.bark();
    }
}