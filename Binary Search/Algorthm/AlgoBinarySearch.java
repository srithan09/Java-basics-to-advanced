public class AlgoBinarySearch {
    public static void BinarySearch(int[] arr,int target)
    {
        int n = arr.length;
        int start =0;
        int end = n-1;
        while (start<end) {
            int mid = start+(end-start)/2;
            if(arr[mid] == target)
            {
                return arr[mid];
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {30,70,21,10,78};
        
    }
}