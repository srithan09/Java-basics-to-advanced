public class A {
    public void display() {
        System.out.println("Class A");
    }
}
public class B extends A {
    public void display() {
        System.out.println("Class B");
    }
}
public class C extends A {
    public void display() {
        System.out.println("Class C");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new A(); // Create an object of class A
        B b = new B(); // Create an object of class B
        C c = new C(); // Create an object of class C

        A ref; // Reference variable of type A

        ref = a; // Assigning object of A to reference variable
        ref.display(); // Calls display() method of class A

        ref = b; // Assigning object of B to reference variable
        ref.display(); // Calls display() method of class B

        ref = c; // Assigning object of C to reference variable
        ref.display(); // Calls display() method of class C
    }
}


