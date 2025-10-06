import java.util.*;
class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int small = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                second = small;
                small = arr[i];
            }
            else if(arr[i]>small && arr[i]<second)
            {
                second = arr[i];
            }
        }
        if(second == Integer.MAX_VALUE)
        {
            ans.add(-1);
            return ans;
        }
        ans.add(small);
        ans.add(second);
        return ans;
        
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {4, 2, 1, 3, 1};
        System.out.println(s.minAnd2ndMin(arr));
    }
}
