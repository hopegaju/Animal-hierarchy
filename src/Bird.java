public class Bird extends Animal {
    double weight;

    public Bird(double weight) {
        this.weight = weight;
    }

    public void fly() {
        System.out.println("Birds do Fly!");
    }
    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp!");
    }
}
