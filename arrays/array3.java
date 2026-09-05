import java.util.Scanner;

public class array3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int arr[] = {10,2,3,4,5,6,6,6,6};
          System.out.println("enter element:");
          int target = sc.nextInt();

          int count =0;
        for(int i = 0;i<arr.length;i++){
             if(arr[i] == target){
                count++;
             }
        }
        System.out.println("count of " + target + " is: " + count);
    sc.close();
    
    }
}
