import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = input.nextInt();
        int[] arr;
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();

        System.out.println("Enter the element you want to remove: ");
        int X = input.nextInt();
        int c;
        for(int i = 0; i<size;i++){
            if(arr[i]!=X){
                arr[c]=arr[i];
                c++;
            }
        }
        size = c;
        System.out.println("Array remaining after removing the element " + X + " is: ");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
