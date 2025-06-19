import java.util.HashMap;
public class BetterApproach {
    public static int longestSubArrayWithSumK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == k) {
                maxLength = Math.max(maxLength, i+1); // from index 0 to i
            }

            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }

            if (map.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - map.get(currentSum - k));
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,0,0,0,3};
        int k = 3;
        int result = longestSubArrayWithSumK(arr, k);
        System.out.println("Length of the longest subarray with sum " + k + " is: " + result);
        
    }
    
}
