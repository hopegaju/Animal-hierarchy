public class Bird extends Animal {
    public void fly() {
        System.out.println("Birds do Fly!");
    }
    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp!");
    }
}
