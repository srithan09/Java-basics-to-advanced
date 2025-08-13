
import java.util.*;
public class OptimalKadane {
    public int KadaneOptimal(int[] arr)
    {
        int n = arr.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i];
            if(sum<0)
            {
                sum = 0;
            }
            else if(sum>max)
            {
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        OptimalKadane obj = new OptimalKadane();
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        int res = obj.KadaneOptimal(nums);
        System.out.println(res);
    }
}
