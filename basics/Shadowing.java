public class Shadowing {
    static int x = 10; // class variable

    public static void main(String[] args) {
        System.out.println(x); // 10
        int x = 20; // local variable
        System.out.println(x); // 20
        System.out.println(Shadowing.x); // Classname.variable to acess the shadowing varaiable
        
    }
}
