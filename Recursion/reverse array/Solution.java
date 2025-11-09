
public class Solution {
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr,int i,int n)
    {
        if(i>=n/2)
        {
            return;
        }
        swap(arr,i,n-i-1);
        reverse(arr, i+1, n);
    }
    public static void main(String[] args) {
        int[] arr ={30,70,21,10,78};
        int n = arr.length;
        reverse(arr,0,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
