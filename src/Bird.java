public class Bird extends Animal {
    double weight;

    public Bird(double weight) {
        this.weight = weight;
    }

    public void fly() {
        if (weight > 5.0) {
            System.out.println("This bird is overweight and cannot fly well.");
        } else {
            System.out.println("This bird is flying!");
        }
    }
    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp!");
    }
}
