/* Next — Problem 17

Remove a particular character from a String. */

import java.util.Scanner;

public class string12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = sc.nextLine();
        System.out.println("enter the chracter u wanna delete: ");
        char asterisck = sc.next().charAt(0);
  

        String string2 = string.replace(String.valueOf(asterisck), "");

        System.out.println("the new string:" + string2);

        sc.close();
    }
}
