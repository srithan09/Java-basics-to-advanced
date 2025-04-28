interface Animal {
    public abstract void eat();
    void sleep();
    public static final int age = 5; // constant
    public static void info() {
        System.out.println("This is an animal interface.");
    }
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats meat.");
    }
    public void sleep() {
        System.out.println("Dog sleeps in a kennel.");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats fish.");
    }
    public void sleep() {
        System.out.println("Cat sleeps on the sofa.");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        Animal.info();
        System.out.println("Dog's age: " + Animal.age);

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}