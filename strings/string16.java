/* Problem

Given a string, count how many times each character occurs. */

import java.util.Scanner;
public class string16 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("enter the string:");
   String string = sc.nextLine();
   
   for(int i = 0;i<string.length();i++){
    char current = string.charAt(i);
    int count = 0;
    for(int j = 0;j<string.length();j++){
      if(current == string.charAt(j)){
        count++;
      }
    }
    System.out.println("the frequency of each :" +current +":"+count  );

   }
    sc.close();
   }
}
