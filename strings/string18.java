
//first repeating character 
import java.util.Scanner;
public class string18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String string = sc.nextLine();
        for(int i = 0;i<string.length();i++){
            char current = string.charAt(i);
            int count = 0;
            for(int j = 0;j<string.length();j++){
             if(current == string.charAt(j))
             {
                count++;
             }
            }
            if(count >= 2){
                System.out.println("the first repeating char :" +current  );
                break;
            }
        }
        sc.close();
    }
}
