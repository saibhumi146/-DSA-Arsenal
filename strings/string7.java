//String Basic Problem 7 — Remove Spaces

import java.util.Scanner;
public class string7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String string = sc.nextLine();
        
        String result = "";
        for (int i = 0; i < string.length(); i++) {
        char current = string.charAt(i);

        if(current !=' '){ //logic 
            result = result + current;
        }
    }
    System.out.println("string without spaces: " +result);
    sc.close();

    }
}
