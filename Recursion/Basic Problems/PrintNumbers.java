
public class PrintNumbers {
    public static void printNumbers1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumbers1(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers1(n);
    }
}
