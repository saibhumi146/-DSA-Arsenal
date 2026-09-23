/* Problem 14 — Find the Largest Word

Write a Java program to find the word with the maximum number of characters in a sentence. */

import java.util.Scanner;

public class string9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String string = sc.nextLine();
        String largest = "";
        String[] words = string.split(" "); // key concept

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }
        System.out.println("the largest word :" +largest);
sc.close();


    }
}
