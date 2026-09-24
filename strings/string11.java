/* String Basic Problem 16 — Replace a Character
Write a Java program that:
Takes a String.
Takes a character to be replaced.
Takes the new character.
Replaces every occurrence of the old character with the new character. */

import java.util.Scanner;
public class string11 {
    public static void main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string:");
     String string = sc.nextLine();
     System.out.println("enter the chracter u wanna replace: ");
     char asterisck = sc.next().charAt(0);
     System.out.println("enter the new character: ");
     char happy  = sc.next().charAt(0);

        String string2 =   string.replace(asterisck, happy);
        
        System.out.println("the new string:"+string2);
    
 


     sc.close();
    }


}
