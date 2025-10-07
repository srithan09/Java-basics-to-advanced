import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class Solution {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n+1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : arr)
        {
            freq[i]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(freq[i]==2)
            {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        ans = findDuplicates(arr);
        System.out.println(ans);
    }
}