import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void func(int index,int[] nums,List<Integer> sub,List<List<Integer>> ans)
    {
        if (index == nums.length) {
        ans.add(new ArrayList<>(sub));
        return;
        }
        sub.add(nums[index]);
        func(index+1, nums, sub, ans);
        sub.remove(sub.size()-1);
        int i = index+1;
        while(i<nums.length && nums[i] == nums[i-1])
        {
            i++;
        }
        func(i, nums, sub, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        func(0, nums,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,2};
        List<List<Integer>> ans = sol.subsets(nums);
        System.out.println(ans);
    }
}