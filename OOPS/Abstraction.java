abstract class Animal {
    public abstract void sound();
    public void sleeping() {
       System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks
        dog.sleeping(); // Output: Animal is sleeping

        Animal cat = new Cat();
        cat.sound(); // Output: Cat meows
        cat.sleeping(); // Output: Animal is sleeping
    }
}