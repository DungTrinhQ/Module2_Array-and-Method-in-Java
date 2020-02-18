import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row = input.nextInt();
        System.out.println("Enter the cols");
        int cols = input.nextInt();
        int[][] arr = new int[row][cols];
        System.out.println("Enter element in array");
        int i = 0, j = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + ", " + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = arr[0][0];
        for (i = 0; i < row; i++) {
            for (j = 1; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The largest element in the array is " + max);


    }
}
