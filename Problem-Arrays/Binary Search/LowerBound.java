public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19,20,22};
        int target = 9;
        int ans = lowerBound(arr, target);
        System.out.println(ans);
    }

    static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target <= arr[mid]) {
                ans = mid;
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        return arr[ans];
    }
}
