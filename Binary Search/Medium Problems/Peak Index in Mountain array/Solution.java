
public class Solution {
    public static int PeakIndex(int[] arr)
    {
        int n = arr.length;
        int start = 1;
        int end = n-2;
        while (start<= end) {
            int mid = start + (end-start)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid-1]<arr[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 3, 8, 9, 5, 2};
        int ans = PeakIndex(arr);
        System.out.println(ans);
    }
}
