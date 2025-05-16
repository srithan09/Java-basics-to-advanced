public class Fibbonacci {
    public static void FibCal(int a,int b , int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c + " ");
        FibCal(b,c, n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        FibCal(a, b, n-2);
        // 0 1 1 2 3 5 8 13 21 34
    }
}
