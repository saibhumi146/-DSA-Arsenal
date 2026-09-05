import java.util.Scanner;
public class array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int arr[] = new int[5];
          
        System.out.println("Enter 5 integers : ");
        for (int i =0;i<arr.length;i++){
             System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt(); }

         int sum = 0;
         for(int i =0;i<arr.length;i++){
            sum+=arr[i];

         }
         System.out.println("sum of all elements in the array is:" + sum);


         sc.close();
    }
    
}
