
public class solution {
    public static int SecondLargest(int[] arr)
    {
        int large = arr[0];
        int second = -1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                second = large;
                large = arr[i];
            }
            else if(arr[i]<large && arr[i]>second)
            {
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {43,32,56,98,20};
        int ans = SecondLargest(arr);
        System.out.println("Second Largest element would be "+ans);
    }
}
