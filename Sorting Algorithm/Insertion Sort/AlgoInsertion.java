
public class AlgoInsertion {
        public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void InsertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        InsertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
