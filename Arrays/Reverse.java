public class Reverse {
    public static void ReverseArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            arr[start] = arr[start]^arr[end];
            arr[end] = arr[start]^arr[end];
            arr[start] = arr[start]^arr[end];
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ReverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
