public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.eat();
        dog.eat();
        dog.makeSound();
        cat.makeSound();

    }
}
