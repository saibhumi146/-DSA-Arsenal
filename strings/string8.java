/* String Basic Problem 9 — Convert Lowercase to Uppercase and vice versa 

Write a Java program that takes a String and converts all lowercase letters to uppercase. */

/* import java.util.Scanner;
public class string8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = sc.nextLine();
        
        String asterisk = string.toUpperCase();
        System.out.println("the uppercase string:" +asterisk);
        sc.close();
    }
}
 */

 import java.util.Scanner;
public class string8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = sc.nextLine();
        
        String asterisk = string.toLowerCase();
        System.out.println("the lowercase string:" +asterisk);
        sc.close();
    }
}