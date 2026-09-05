import java.util.Scanner;

public class array11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i =0;i<arr.length;i++){
            System.out.println("enter element"+ i +":");
            arr[i] = sc.nextInt();
        }
        int n = arr.length;

        int expectedsum = n*(n+1) /2;
        System.out.println("expected sum"+expectedsum+":");
       int actualsum = 0;
       for(int i = 0;i<n;i++){
        actualsum+=arr[i];
       }
        System.out.println("actual sum:"+actualsum);
        

        int missing = expectedsum-actualsum;
        System.out.println("missing number is " +missing+ ":");



        sc.close();
    }
    
}
