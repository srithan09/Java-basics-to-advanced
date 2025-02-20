

public class Seach2D {
    static void search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("The target " + target + " is found at " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("The target " + target + " is not found");
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 5;
        search(arr, target);
    }
    
}
