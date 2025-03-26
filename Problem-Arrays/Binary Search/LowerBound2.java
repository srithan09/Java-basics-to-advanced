public class LowerBound2 {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19,20,22};
        int target = 21;
        int ans = lowerBound2(arr, target);
        System.out.println(ans);
    }
    static int lowerBound2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
              
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return arr[start];
    }
}
