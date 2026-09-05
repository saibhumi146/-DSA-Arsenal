import java.util.Scanner;

public class hams {
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        System.out.println("Enter 2nd integer:");
        int n1 = sc.nextInt();
        System.out.println("Enter 3rd integer:");
        int n3 = sc.nextInt();
        int result = factorial(n);
         int result1 = factorial(n1);
          int result3 = factorial(n3);
        System.out.println("Factorial of " + n + " is: " + result);
         System.out.println("Factorial of " + n1 + " is: " + result1);  
          System.out.println("Factorial of " + n3 + " is: " + result3);

        sc.close();
    }

   public static int factorial(int n)
   {
     int factorial = 1;
     for(int i=1;i<=n;i++)
     {
         factorial=factorial*i;
     }  
     return factorial;
   }


}
