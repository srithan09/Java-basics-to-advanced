public class Solution {
    public static int MissingNumber(int[] arr) {
        //cyclic sort
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correctIndex = arr[i];
            if (arr[i] < n && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(MissingNumber(arr)); 
    }
}
