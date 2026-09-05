
import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int arr[] = new int[5];
        System.out.println("Enter 5 integers : ");

        for(int i =0;i<arr.length;i++){
            System.out.println("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
       
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum= (sum+arr[i]);
        }

        double average = (double) sum / arr.length;
        System.out.println("Average of array elements is: " + average);

        sc.close();
    }
}
