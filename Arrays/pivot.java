public class pivot {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int right_sum =0;
        int left_sum=0;
        int ans =-1;
        for(int i=0;i<n;i++)
        {
            right_sum = right_sum+nums[i];
        }
        for(int i=0;i<n;i++)
        {
            right_sum = right_sum - nums[i];
            if(right_sum == left_sum)
            {
                ans =i;
                break;
            }
            left_sum =left_sum+nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = pivotIndex(nums);
        System.out.println("Pivot Index: " + result);
    }
}
