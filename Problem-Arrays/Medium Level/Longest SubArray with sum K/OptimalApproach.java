public class OptimalApproach {
    public static int longestSubArrayWithSumK(int[] arr, int k) {
        int left =0;
        int right=0;
        int sum = arr[0];
        int maxLength = 0;
        int n = arr.length;
        while (right <n) {
            while(sum>k && left <= right) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 10;
        int result = longestSubArrayWithSumK(arr, k);
        System.out.println("Length of the longest subarray with sum " + k + " is: " + result);
    }
    
}

