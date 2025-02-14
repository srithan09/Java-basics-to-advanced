public class BlocScope {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        //block scope
        {
            x=x+10;
            int y = 210;
            System.out.println(y);
            System.out.println(x);
        }
        System.out.println(x); // error: cannot find symbol
    }
}
