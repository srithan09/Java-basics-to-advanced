class Solution {
    public int MaxElement(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for (int pile : nums) {
            if (pile > maxi) {
                maxi = pile;
            }
        }
        return maxi;
    }
    public boolean isValid(int[] nums, int threshold,int mid)
    {
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += (int) Math.ceil((double) nums[i] / mid);
        }
        if(sum<=threshold)
        {
            return true;
        }
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = MaxElement(nums);
        int ans =-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(isValid(nums, threshold, mid))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;
    }
}