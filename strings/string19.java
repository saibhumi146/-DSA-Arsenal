//if two strings are anagrams


import java.util.Scanner;

public class string19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st string:");
        String string1 = sc.nextLine();

        System.out.println("Enter the 2nd string:");
        String string2 = sc.nextLine();

        boolean anagram = true;

        // First check length
        if (string1.length() != string2.length()) {

            anagram = false;

        } else {

            // Check frequency of every character
            for (int i = 0; i < string1.length(); i++) {

                char current = string1.charAt(i);

                int count1 = 0;
                int count2 = 0;

                // Count current character in string1
                for (int j = 0; j < string1.length(); j++) {

                    if (current == string1.charAt(j)) {
                        count1++;
                    }
                }

                // Count current character in string2
                for (int j = 0; j < string2.length(); j++) {

                    if (current == string2.charAt(j)) {
                        count2++;
                    }
                }

                // If frequencies are different
                if (count1 != count2) {

                    anagram = false;
                    break;
                }
            }
        }

        if (anagram) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }

        sc.close();
    }
}