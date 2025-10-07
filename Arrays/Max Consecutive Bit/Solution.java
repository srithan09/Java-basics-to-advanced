public class Solution {
    public static int maxConsecBits(int[] arr) {
        // code here
        int count =1;
        int maxi =1;
        int el = arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] == el)
            {
                count++;
            }
            else
            {
                count =1;
                el = arr[i];
            }
            maxi = Math.max(maxi,count);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,1,1};
        System.out.println("max concsecutive bits are: "+maxConsecBits(arr));
    }
}
