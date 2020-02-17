import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = input.nextInt();
        int[] arr;
        arr = new int[size];
        int i = 0, j =0;
        while (i < size) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (j = 0; j < size; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();

        System.out.println("Enter the element you want to add ");
        int X = input.nextInt();
        System.out.println("Enter the location: ");
        int index = input.nextInt();
        int[] newArr = new int[size + 1];
        System.arraycopy(arr,0,newArr,0,index);
        newArr[index]=X;
        System.arraycopy(arr,index,newArr,index+1,size-index);

        System.out.println("Array remaining after removing the element " + X + " is: ");
        for (i = 0; i <newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }


    }
}
