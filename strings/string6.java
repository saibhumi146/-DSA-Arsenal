/* String Basic Problem 6 — Check Palindrome

Write a Java program to check whether a String is a palindrome.
Take the original String.
Create its reverse.
Compare original and reverse.
If they are equal → palindrome.
 */


import java.util.Scanner; 
public class string6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String string = sc.nextLine();
   
        String reverse = "";
        for(int i= string.length()-1; i >= 0  ;i--){
            reverse = reverse+string.charAt(i);
        }

        if(string.equals(reverse)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("is not palindrome");
        }
        sc.close();

    }
}
