import java.util.*;
public class BruteForce {
    public int KadaneBrute(int[] arr)
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                int sum =0;
                for(int k = i ;k<j;k++)
                {
                    sum = sum+arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        BruteForce obj = new BruteForce();
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        int res = obj.KadaneBrute(nums);
        System.out.println(res);
    }
}
