import java.util.Scanner;

public class array8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;

        // Checking if array is sorted
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        sc.close();
    }
}