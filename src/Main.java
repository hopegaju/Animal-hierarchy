public class Main {
    public static void main(String[] args) {
        Bird snow = new Bird((50));
        Cat scoop = new Cat();
        Dog sword = new Dog();
        snow.fly();
        //Polymorphism
        snow.makeSound();
        scoop.makeSound();
        sword.makeSound();
        //Override
        sword.guardHouse();
    }
}