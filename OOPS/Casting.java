class A {

    public void show1() {
        System.out.println("A's show() method");
    }
    
}

class B extends A {
    public void show2() {
        System.out.println("B's show() method");
    }
    
}


public class Casting {
    public static void main(String[] args) {
        A a = new A(); // Creating an object of class A
        B b = new B(); // Creating an object of class B

        a.show1(); // Calling method from class A
        b.show1(); // Calling method from class A (inherited)
        b.show2(); // Calling method from class B

        // Upcasting: B object is referred by A reference
        A a1 = new B(); // Upcasting
        a1.show1(); // Calling method from class A (inherited)
        // a1.show2(); // This will give an error because show2() is not in class A

        // Downcasting: A reference is casted to B reference
        B b1 = (B) a1; // Downcasting
        b1.show1(); // Calling method from class A (inherited)
        b1.show2(); // Calling method from class B
    }
    
}
