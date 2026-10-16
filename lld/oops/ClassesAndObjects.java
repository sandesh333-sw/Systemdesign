/**
 * https://algomaster.io/learn/lld/classes-and-objects
 * Class: is a blueprint, template, or recipe for creating objects with similar structure but independent state.
 * characteristics: it groups related data(attributes) and actions (methods) together.
 * 
 */

/**
 * Object: is an instance of class. It's the actual thing you can interact with, store data in, and invoke methods on.
 * When we create an object , we are essentially saying "Take this blueprint which is (class) and build one actual thing(object) out of it"
 */

public class ClassesAndObjects{
    //Attributes
    private String brand;
    private String model;
    private int speed;

    //Constructor
    public ClassesAndObjects(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    //Method to accelerate
    public void accelerate(int increment){
        speed += increment;
    }

    //Method to display info
    public void displayStatus(){
        System.out.println(brand + "is running at "+ speed + "kilometre/h");
    }

    public static void main(String[] args){
        //Creating objects of the Car class
       ClassesAndObjects  corolla = new ClassesAndObjects("Toyota", "Corolla");
       corolla.accelerate(20);
       corolla.displayStatus();
       System.out.println("-------------------------------");
    }

}