import java.util.Scanner;

public class MergeArray {
    public static void enterElement(String message, int[] array) {
        int i = 0, j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.print(message);
        for (j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[7];
        enterElement("Array 1: ", arr1);
        enterElement("Array 2: ", arr2);

        int[] arr3 = new int[12];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int c = arr1.length;
        for (int j = 0; j < arr2.length; j++) {
            arr3[c] = arr2[j];
            c++;
        }
        System.out.print("Array 3: ");
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + "\t");
        }
        System.out.println();

    }
}
