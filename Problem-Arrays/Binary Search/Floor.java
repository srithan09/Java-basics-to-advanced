public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int target = 4;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if(arr[mid] <= target)
            {
                ans = arr[mid];
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
           
        }
        return ans;
    }
}
