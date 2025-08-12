import java.util.*;

public class OptimalApproach4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for i

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicates for j

                int p = j + 1;
                int k = n - 1;

                while (p < k) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[k];

                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        k--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[k]));
                        p++;
                        k--;

                        while (p < k && nums[p] == nums[p - 1]) p++; // Skip duplicates for p
                        while (p < k && nums[k] == nums[k + 1]) k--; // Skip duplicates for k
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        OptimalApproach4Sum obj = new OptimalApproach4Sum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = obj.fourSum(nums, target);
        System.out.println(result);
    }
}
