/**
 * Polymorphism means one thing having many forms. For example, the same method name can behave differently depending on its parameters or the object calling it.
 */

//1.Compile time polymorphism(Method Overloading)


// public class Polymorphism{

//     static int add(int a, int b){
//         return a + b;
//     }

//     static int add(int a, int b, int c){
//         return a + b + c;
//     }

//     static double add(double a, double b){
//         return a + b;
//     }


// public static void main(String[] args){
//         System.out.println(add(10, 20));
//         System.out.println(add(10, 20, 30));
//         System.out.println(add(5.5, 2.5));
//     }
// }


/**
 * 
 * 2. Runtime Polymorphism(Method Overriding): Here Java decides which implementation to execute at runtime based on the actual object's type.
 */


class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Polymorphism{
    public static void main(String[] args){

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();
        animal2.sound();
    }
}