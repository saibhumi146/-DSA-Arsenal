
/* //Problem: Take 5 integers in an array and print all elements. */
import java.util.Scanner;



public class array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 integers : ");

        for (int i =0;i<arr.length;i++){
             System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
    System.out.println("Array elements are:");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
 sc.close();

    }
}
