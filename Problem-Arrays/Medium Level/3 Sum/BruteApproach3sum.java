import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BruteApproach3sum {
    public List<List<Integer>> threeSum(int[] nums)
    {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i =0;i<n ; i++)
        {
            for(int j = i+1;j<n;j++)
            {
                for(int k = j+1;k<n;k++)
                {
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum == 0)
                    {
                        List<Integer> list = new ArrayList<>();
                        list = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
    public static void main(String[] args) {
        BruteApproach3sum obj = new BruteApproach3sum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(obj.threeSum(nums));
    }
}
