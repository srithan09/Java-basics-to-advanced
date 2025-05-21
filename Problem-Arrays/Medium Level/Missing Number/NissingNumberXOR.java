
public class NissingNumberXOR {
        public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        System.out.println("Missing number is: " + findMissingNumberXOR(arr, n));
    }

    public static int findMissingNumberXOR(int[] arr, int n) {
        int totalXor = 0;
        int arrayXor = 0;
        // Calculate XOR of all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            totalXor ^= i;
        }
        // Calculate XOR of all elements in the array
        for (int i = 0; i < n; i++) {
            arrayXor ^= arr[i];
        }
        return totalXor - arrayXor;
    }
}
