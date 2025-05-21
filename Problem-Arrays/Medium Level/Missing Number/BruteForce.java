

public class BruteForce {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        System.out.println("Missing number is: " + findMissingNumberBrute(arr, n));
    }

    public static int findMissingNumberBrute(int[] arr, int n) {
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return 0;
    }
}
