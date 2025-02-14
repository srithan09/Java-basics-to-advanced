import java.util.Scanner;

class Calculator {
    public int add(int i, int j) {
        return i + j;
    }

    public int sub(int i, int j) {
        if(i > j) {
            return i - j;
        } else {
            return j - i;
        }
        
    }

    public int mul(int i, int j) {
        return i * j;
    }

    public int div(int i, int j) {
        return i / j;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        Calculator c = new Calculator(); // object creation along with the use of constructor
        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Subtraction: " + c.sub(a, b));
        System.out.println("Multiplication: " + c.mul(a, b));
        if (b != 0) {
            System.out.println("Division: " + c.div(a, b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        sc.close();
    }
}