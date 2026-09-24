/* Next — Problem 20

Count uppercase and lowercase characters */

import java.util.Scanner;
public class string15 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System .out.println("Enter the string:");
       String string = sc.nextLine();
       int uppercase = 0;
       int lowercase = 0;
       for(int i = 0;i<string.length();i++)
       {
        char current = string.charAt(i);
         if(current >='a' && current <='z'){
            lowercase++;
         }
         else if(current >= 'A' && current <= 'Z') {
            uppercase++;
         }

       }
       System.out.println("uppercase:" +uppercase);
       System.out.println("lowercase:"+lowercase);





        sc.close();

    }
}
