class Solution {
    public int maxElement(int[] bloomDay)
    {
        int maxi = Integer.MIN_VALUE;
        for (int i : bloomDay) {
            if(i> maxi)
            {
                maxi =i;
            }
        }
        return maxi;
    }
    public int minElement(int[] bloomDay)
    {
        int mini = Integer.MAX_VALUE;
        for (int i : bloomDay) {
            if(i<mini)
            {
                mini = i;
            }
        }
        return mini;
    }
    public boolean isValid(int[] bloomDay, int m, int k,int days)
    {
        int count =0;
        int noOfB = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i]<=days)
            {
                count++;
                if(count ==k)
                {
                    noOfB = noOfB + (count/k);
                    count =0;
                }
            }
            else
            {
                count =0;
            }
        }
        noOfB = noOfB+(count/k);
        if(noOfB >= m)
        {
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int start = minElement(bloomDay);
        int end = maxElement(bloomDay);
        int ans = -1;
        if((m*k)> bloomDay.length)
        {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(isValid(bloomDay,m,k,mid))
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
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;

        int result = sol.minDays(bloomDay, m, k);
        System.out.println("Minimum number of days = " + result);
    }
}