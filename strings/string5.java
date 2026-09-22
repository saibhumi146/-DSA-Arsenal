//String Basic Problem 5 — Reverse a String 🔄

import java.util.Scanner;

public class string5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String string = sc.nextLine();

        String reverse = "";

        for (int i = string.length() - 1; i >= 0; i--) {
          reverse = reverse + string.charAt(i);
        }
    System.out.println("Reversed String: " +reverse);
    sc.close();
    }
}
