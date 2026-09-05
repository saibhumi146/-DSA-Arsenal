import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter elements" + i + ":");
            arr[i] = sc.nextInt();
        }

        int index = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
