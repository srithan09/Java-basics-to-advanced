
public class MultiDim {
    public static void main(String[] args) {
        create2DArray();
    }

    public static void create2DArray() {
        int[][] arr = new int[2][2];
        System.out.println("Enter 4 integers for the 2x2 array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        print2DArray(arr);
    }

    public static void print2DArray(int[][] arr) {
        System.out.println("The 2D array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}