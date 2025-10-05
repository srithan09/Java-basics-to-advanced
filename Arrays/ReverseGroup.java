public class ReverseGroup {
    public static void reverseInGroups(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            int start = i;
            int end = i + k - 1;
            if (end >= arr.length) {
                end = arr.length - 1;
            }
            // Reverse each group using XOR swap
            while (start < end) {
                arr[start] = arr[start] ^ arr[end];
                arr[end] = arr[start] ^ arr[end];
                arr[start] = arr[start] ^ arr[end];
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        reverseInGroups(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
