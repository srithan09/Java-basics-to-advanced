import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BetterApproach3Sum {
    
    public List<List<Integer>> threeSum(int[] nums)
    {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            Set<Integer> hs = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third = -(nums[i]+nums[j]);
                if(hs.contains(third))
                {
                    List<Integer> temp = new ArrayList<>();
                    temp = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hs.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static void main(String[] args) {
        BetterApproach3Sum obj = new BetterApproach3Sum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(obj.threeSum(nums));
    }
}
