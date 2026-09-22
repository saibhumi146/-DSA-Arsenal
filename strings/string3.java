//count the occurence of character 

import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the String:");
        String string = sc.nextLine();
        System.out.println("Enter the character to be counted:");
        char one = sc.next().charAt(0);

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (current == one) {
                count++;
            }
        }
        System.out.println(one + "occured" + count + "times");
        sc.close();
    }
}
