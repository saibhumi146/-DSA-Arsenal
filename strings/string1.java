//Write a Java program that takes a String as input and counts the total number of characters in it.

import java.util.Scanner;
public class string1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String asterisk = sc.nextLine();
        int count = 0;
        for(int i = 0;i<asterisk.length();i++){
            count++;
        }
        System.out.println("number of characters: "+count);
        sc.close();
    }
    
}
