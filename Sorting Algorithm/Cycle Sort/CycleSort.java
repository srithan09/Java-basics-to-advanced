
public class CycleSort {
    public static void AlgoCyclicSor(int[] arr)
    {
        //the following array will be given from 1 to n and then we need to sort according to the index
        int i=0;
        while(i<arr.length)
        {
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex])
            {
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        AlgoCyclicSor(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
