import java .util.Scanner;

public class nonsense {
    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out .println("Enter an integer:");
        int num1 = sc.nextInt();
        System.out.println("enter second integer:");
        int num2 = sc.nextInt();
           
            
            System.out.println("The maximum number is: " + findMax(num1,num2));
           
             sc.close();
        }
        
            public static int findMax(int num1,int num2){
            if(num1>num2){
                return num1;
            }
            else{
                return num2;
            }
            }
        }
    
        
      