/* String Basic Problem 4 — Find First Occurrence of a Character

Write a Java program that:

Takes a String from the user.
Takes a character from the user.
Finds the index of the first occurrence of that character.
If the character doesn't exist, print -1.
 */

import java.util.Scanner; 
public class string4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        System.out.println("enter the string:");
        String string = sc.nextLine();
        System.out.println("enter the chararcter to be searched:");
        char one = sc.next().charAt(0);
        boolean found = false;
        for (int i = 0;i<string.length();i++)
        {
            char current = string.charAt(i);
            if(current == one)
            {
                System.out.println("element exists at index:" + i);
                found = true;
                break;
            }
        }
            if(found == false){
                System.out.println("-1");
            }
        
        sc.close();
    }
}
