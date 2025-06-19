import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bruteforce {
    public static List<Integer> TwoSum(int[]arr , int target)
    {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum =0;
                sum = arr[i]+arr[j];
                if(sum == target)
                {
                    res.add(i);
                    res.add(j);
                    return res;
                }
            }
        }
        return res;
    }
 
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        List<Integer> result = new ArrayList<>();
        result = TwoSum(arr, target);
        System.out.println(result);
    }
}
