import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = input.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Enter element in array");
        int i = 0, j = 0;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("Enter element [" + i + ", " + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int total = 0;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (i == j)
                    total += arr[i][j];
            }
        }
        System.out.println("Total main diagonal is " + total);
    }
}
