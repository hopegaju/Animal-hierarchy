public class Dog  extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Bark!");
    }

    @Override
    public void guardHouse() {
        super.guardHouse();
    }
}
