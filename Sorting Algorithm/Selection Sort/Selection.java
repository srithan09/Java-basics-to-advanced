public class Selection {
    public static int getMaxIndex(int[] arr,int start,int end)
    {
        int max = arr[start];
        int ans =0;
        for (int i = start; i <= end; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
                ans =i;
            }
        }
        return ans;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void SelectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }
    public static void main(String[] args) {
        int[] arr = {30,70,21,10,78};
        SelectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
