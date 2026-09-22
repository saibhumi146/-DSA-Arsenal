//count the no of consos and vowels 

import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < string.length(); i++) {
            char one = string.charAt(i);

            if (one == 'a' || one == 'e' || one == 'i' || one == 'o' || one == 'u' || one == 'A' || one == 'E'
                    || one == 'I' || one == 'O' || one == 'U') {
                vowels++;

            } else {

                consonants++;
            }
        }
        System.out.println("vowels :" + vowels);
        System.out.println("consonants:" + consonants);

        sc.close();
    }

}
