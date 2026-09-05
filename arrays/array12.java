//program to remove a single element 
import java.util.Scanner;
public class array12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for(int i =0;i<arr.length;i++){
            System.out.println("enter element"+i+":");
            arr[i]=sc.nextInt();
        }
        int result = 0;
        for(int i = 0;i<arr.length;i++){
            result = result ^ arr[i];
        }
     System.out.println("Single number is:" +result);
     sc.close();





        }
}
