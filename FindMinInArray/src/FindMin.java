import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element in array: ");
        int i = 0;
        for (i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Array: ");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        int min = arr[0];
        int index = 0;
        for (i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min Element is " + min + " at position " + index);
    }
}
