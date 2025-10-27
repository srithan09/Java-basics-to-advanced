
public class Solution {
    public static int firstOccurance(int[] nums, int target)
    {
        int start =0;
        int end = nums.length-1;
        int ans = -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                end = mid-1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
    }public static int lastOccurance(int[] nums, int target)
    {
        int start =0;
        int end = nums.length;
        int ans = -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                start = mid+1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstOccurance(nums, target);
        ans[1] = lastOccurance(nums, target);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
    }
}
