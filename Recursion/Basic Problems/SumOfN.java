public class SumOfN {
    public static int sumOfN(int i,int n,int sum) {
        if(i>n) {
            return sum;
        }
        sum += i;
        return sumOfN(i+1,n,sum);
    }

    public static void main(String[] args) {
        int n = 5; // Calculate sum from 1 to 5
        int result = sumOfN(1, n, 0);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + result);
    }
}
