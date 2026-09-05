import java.util.Scanner;

public class array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {10,20,30,40,50};

        System.out.println("enter the element to be searched:");
        int target = sc.nextInt();

        /* the boolean approach is used to check if the element is found or not. 
        If found, it will be set to true and break the loop.
         it wont give at which index the element is found 
        
        boolean found = false;
        for(int i=0;i<arr.length;i++){  
            
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        } */


        // the index approach is used to check if the element is found or not.
        int index = -1 ;
        for(int i =0;i<arr.length;i++){
            if (arr[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }


        sc.close(); 
    }
}
