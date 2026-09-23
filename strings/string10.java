/* String Basic Problem 15 — Find the Smallest Word

Now do the opposite of the previous problem.

Write a Java program to find the word with the minimum number of characters in a sentence. */


import java.util.Scanner;
public class string10 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String string = sc.nextLine();
        String[] words = string.split(" "); // key concept
        String smallest = words[0];
        
        for (int i = 1; i < words.length; i++) {
            System.out.println(words[i]);

            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        System.out.println("the smallest word :" +smallest);
sc.close();

    }
    
}
