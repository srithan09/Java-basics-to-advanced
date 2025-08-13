public class BetterApproach {
    public int KadaneBetter(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum =0;
            for(int j =i;j<n;j++)
            {
                sum = sum+arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        BetterApproach obj = new BetterApproach();
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        int res = obj.KadaneBetter(nums);
        System.out.println(res);
    }
    
}
