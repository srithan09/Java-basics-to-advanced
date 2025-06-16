
public class BruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1 ,1,1,1,1,4,2,3};
        int k = 3;
        System.out.println("Longest subarray with sum " + k + ": " + longestSubarray(arr, k));
        
    }
    static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
}
