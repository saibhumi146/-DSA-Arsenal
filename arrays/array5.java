import java.util.Scanner;


public class array5 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int arr[] = new int[15];
     arr[0]= 12;
     arr[1] =24;
     arr[2]=35;
     arr[3]=45;
     arr[4]=56;
     int size = 5;

     int index = 2;
     int value = 100;

        for(int i = size; i>index ;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        size++;

        System.out.println("Array elements after insertion are:");
        for(int i =0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }   
}


  

