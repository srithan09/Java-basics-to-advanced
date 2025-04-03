public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        int[] ans = searchRange(arr, target);
        System.out.println("First occurrence: " + ans[0] + ", Last occurrence: " + ans[1]);
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        // Find first occurrence
        ans[0] = findBound(arr, target, true);
        // Find last occurrence
        ans[1] = findBound(arr, target, false);
        return ans;
    }

    static int findBound(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid; // Potential answer found
                if (isFirst) {
                    end = mid - 1; // Look in left half for first occurrence
                } else {
                    start = mid + 1; // Look in right half for last occurrence
                }
            }
        }
        return ans;
    }
}