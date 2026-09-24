
/* String Basic Problem 18 — Check if String Contains Only Alphabets 🔤

Write a Java program to check whether a String contains only alphabetic characters (A-Z or a-z). */

import java.util.Scanner;

public class string13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String string = sc.nextLine();

        boolean onlyAlphabets = true;

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);

            if (!(current >= 'a' && current <= 'z') || (current >= 'A' && current <= 'Z')) {

                onlyAlphabets = false;

                break;

            }

        }
        if (onlyAlphabets) {
            System.out.println("string only contain alphabets");
        } else {
            System.out.println("string does not only conntains alphabets");
        }
        sc.close();
    }
}
