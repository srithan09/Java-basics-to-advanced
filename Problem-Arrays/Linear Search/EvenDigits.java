

public class EvenDigits {
    public int FindNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            int res = CountDigits(nums[i]);
            if(res%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public int CountDigits(int x)
    {
        int dc =0;
        while(x!=0)
        {
            dc++;
            x=x/10;
        }
        return dc;
    }
    public static void main(String[] args) {
        EvenDigits ed = new EvenDigits();
        int[] nums = {12, 345, 2, 6, 7896};
        int result = ed.FindNumbers(nums);
        System.out.println("Number of elements with an even number of digits: " + result);
    }
    
}
