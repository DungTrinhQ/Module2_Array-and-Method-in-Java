import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A;
        char x;
        int count = 0;
        System.out.println("Enter the string:");
        A = input.nextLine();
        System.out.println("Enter the char:");
        x = input.nextLine().charAt(0);
        for (int i = 0; i < A.length(); i++) {

            if (A.charAt(i) == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
