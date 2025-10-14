
public class BubbleSort {
    public static void Solution(int[] arr)
    {
        int n = arr.length;
        boolean swapped;
        for(int i=0;i<n;i++)
        {
            swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {30,70,21,10,78};
        Solution(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
