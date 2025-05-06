public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        System.out.println("Missing number is: " + findMissingNumber(arr, n));
    }

    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;

        for (int i = 0; i < n; i++) {
            arraySum += arr[i];
        }

        return totalSum - arraySum;
    }
}