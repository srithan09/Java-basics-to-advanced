import java.util.Arrays;

public class Solution1 {
    public static void moveZeroes(int[] nums) {
        int j =-1;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                j=i;
                break;
            }
        }
        if(j == -1)
        {
            return;
        }
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {43,0,56,0,20};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
